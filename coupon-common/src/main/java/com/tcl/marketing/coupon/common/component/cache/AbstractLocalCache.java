package com.tcl.marketing.coupon.common.component.cache;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.util.concurrent.UncheckedExecutionException;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * 关于缓存的失效，我是通过kafka消息通知的，这里要注意事务和失效消息通知要剥离。
 * 缓存清理：先清理redis，再清理本地缓存。每一台服务器所致的group都不一样，要做到每台服务器都能接受到缓存清理消息
 *
 * @param <K>
 * @param <V>
 */
public abstract class AbstractLocalCache<K, V> {

    private Cache<K, Object> cache;

    /**
     * 默认1000个缓存数量
     **/
    private static long DEFAULT_CACHE_SIZE = 1000;

    /**
     * 默认缓存60秒
     **/
    private static long DEFAULT_CACHE_EXPIRE = 60;

    private static Object fixNullObj = new Object();

    private static String NULL_VALUE = "null value";

    public AbstractLocalCache() {

        this.cache = CacheBuilder.newBuilder()
                .maximumSize(DEFAULT_CACHE_SIZE)
                .expireAfterWrite(DEFAULT_CACHE_EXPIRE, TimeUnit.SECONDS)
                .build();
    }

    public AbstractLocalCache(int size, long expireTime) {

        this.cache = CacheBuilder.newBuilder()
                .maximumSize(size)
                .expireAfterWrite(expireTime, TimeUnit.SECONDS)
                .build();
    }

    /**
     * 通过key获取缓存value(当get方法通过key未获取到值时,
     * 使用load方法加载新值并缓存,如果load方法返回null,则同样返回null)
     *
     * @param key 缓存键
     * @return 结果
     */
    public V get(K key) {
        return get(key, null);
    }

    /**
     * 通过key获取缓存value(当get方法通过key未获取到值时,
     * 使用load方法加载新值并缓存,如果load方法返回null,则同样返回null)
     *
     * @param key    缓存键
     * @param params 缓存数据值加载参数
     * @return 结果
     */
    public V get(K key, Object... params) {

        try {

            if (key == null || cache == null) {

                return null;
            }

            Object value = cache.get(key, getCallable(key, params));

            if (isNUll(value)) {

                return null;
            }

            return (V) value;

        } catch (Throwable e) {

            // 增加null值过滤,并返回null
            if (null != e.getCause() && NULL_VALUE.equals(e.getCause().getMessage())) {

                this.cache.put(key, fixNullObj);
                return null;

            }

            if (e instanceof UncheckedExecutionException) {
                e = e.getCause();
            }

            if (e instanceof RuntimeException) {

                throw (RuntimeException) e;
            } else {

                throw new LocalCacheException("Local cache exception: " + e.getMessage(), e);
            }
        }
    }

    /**
     * valueLoader 通过load方法获取实际value
     *
     * @param key    缓存键
     * @param params 缓存数据值加载参数
     * @return 结果
     */
    private Callable<V> getCallable(final K key, final Object... params) {

        return new Callable<V>() {
            @Override
            public V call() throws Exception {

                V v = loadValue(key, params);
                if (v == null) {
                    throw new NullValueException(NULL_VALUE);
                }
                return v;
            }
        };
    }

    /**
     * 加载实际value(通过key或params获取,value缓存时不能为null)
     *
     * @param key    缓存键
     * @param params 获取value的参数数组(可使用key获取)
     * @return 结果value
     */
    protected abstract V loadValue(K key, Object... params);

    /**
     * 存储缓存value
     *
     * @param key   缓存键
     * @param value 缓存值
     */
    public void putValue(K key, V value) {
        cache.put(key, value);
    }

    /**
     * 获取缓存value数量
     *
     * @return 缓存数量
     */
    public long getSize() {
        return cache.size();
    }

    /**
     * 清除key对应的缓存value
     */
    public void cleanKey(K key) {
        cache.invalidate(key);
    }

    /**
     * 清除所有缓存数据
     */
    public void cleanAll() {
        cache.invalidateAll();
    }

    public boolean isNUll(Object obj) {
        return (obj == fixNullObj);
    }

}
