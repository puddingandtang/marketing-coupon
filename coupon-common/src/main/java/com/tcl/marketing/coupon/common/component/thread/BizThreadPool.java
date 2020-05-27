package com.tcl.marketing.coupon.common.component.thread;

import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.concurrent.*;

/**
 * @program: marketing-coupon
 * @description:
 * @author: Mr.Tang
 * @create: 2020-05-27 16:42
 * @version:
 **/
@Slf4j
public class BizThreadPool extends ThreadPoolExecutor{

    private ConcurrentHashMap<String, Long> startTimes;

    BizThreadPool(long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue, ThreadFactory threadFactory){

        super(Runtime.getRuntime().availableProcessors() * 2, Runtime.getRuntime().availableProcessors() * 2, keepAliveTime, unit, workQueue, threadFactory);

        this.startTimes = new ConcurrentHashMap<>();
    }

    @Override
    protected void beforeExecute(Thread t, Runnable r) {

        startTimes.put(String.valueOf(r.hashCode()), System.currentTimeMillis());

        super.beforeExecute(t, r);
    }

    @Override
    protected void afterExecute(Runnable r, Throwable t) {

        long endTime = System.currentTimeMillis();

        // startTimes.remove ，避免 startTimes 过大，导致系统溢出
        long diff = endTime - startTimes.remove(String.valueOf(r.hashCode()));

        // 统计任务耗时、初始线程数、核心线程数、正在执行的任务数量、已完成任务数量、任务总数、队列里缓存的任务数量、池中存在的最大线程数、最大允许的线程数、线程空闲时间、线程池是否关闭、线程池是否终止
        log.info(String.format(
                "biz-pool-monitor: Duration: %d ms, PoolSize: %d, CorePoolSize: %d, Active: %d, Completed: %d, Task: %d, Queue: %d, LargestPoolSize: %d, MaximumPoolSize: %d,KeepAliveTime: %d, isShutdown: %s, isTerminated: %s",
                diff, this.getPoolSize(), this.getCorePoolSize(), this.getActiveCount(), this.getCompletedTaskCount(), this.getTaskCount(),
                this.getQueue().size(), this.getLargestPoolSize(), this.getMaximumPoolSize(), this.getKeepAliveTime(TimeUnit.MILLISECONDS),
                this.isShutdown(), this.isTerminated()));

        super.afterExecute(r, t);
    }

    @Override
    public void shutdown() {
        // 统计已执行任务、正在执行任务、未执行任务数量
        log.info(String.format("biz-pool-monitor, Going to shutdown. Executed tasks: %d, Running tasks: %d, Pending tasks: %d",
                this.getCompletedTaskCount(), this.getActiveCount(), this.getQueue().size()));
        super.shutdown();
    }

    @Override
    public List<Runnable> shutdownNow() {

        log.info(
                String.format("biz-pool-monitor, Going to immediately shutdown. Executed tasks: %d, Running tasks: %d, Pending tasks: %d",
                        this.getCompletedTaskCount(), this.getActiveCount(), this.getQueue().size()));

        return super.shutdownNow();
    }

}
