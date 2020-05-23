package com.tcl.marketing.coupon.service.test;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

public class GuavaCacheTest {

    private static LoadingCache<String, String> cache = CacheBuilder.newBuilder().maximumSize(2)
            .expireAfterWrite(50, TimeUnit.SECONDS)
            .refreshAfterWrite(10, TimeUnit.SECONDS)
            .build(new CacheLoader<String, String>() {
                @Override
                public String load(String key) throws Exception {
                    return "A";
                }
            });

    @Test
    public void expire() {
        try {
            System.out.println(cache.size());
            cache.put("1", "1");
            cache.put("2", "1");
            cache.put("3", "1");
            System.out.println(cache.size());
            while (true) {


                Thread.sleep(1_000L);

                System.out.println(cache.size());
            }


        } catch (Exception e) {

        }


    }
}
