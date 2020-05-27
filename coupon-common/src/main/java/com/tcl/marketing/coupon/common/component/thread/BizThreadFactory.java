package com.tcl.marketing.coupon.common.component.thread;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @program: marketing-coupon
 * @description:
 * @author: Mr.Tang
 * @create: 2020-05-27 13:49
 * @version:
 **/
public class BizThreadFactory implements ThreadFactory {

    private static final AtomicInteger poolNumber = new AtomicInteger(1);

    private final AtomicInteger threadNumber = new AtomicInteger(1);

    private final String namePrefix;

    private volatile boolean isDaemon;

    BizThreadFactory(String bizName){

        this(bizName, false);
    }

    BizThreadFactory(String bizName , boolean isDaemon) {

        namePrefix = bizName+"pool-" + poolNumber.getAndIncrement() + "-thread-";
        this.isDaemon = isDaemon;
    }

    @Override
    public Thread newThread(Runnable r) {

        Thread t = new Thread( r, namePrefix + threadNumber.getAndIncrement());

        t.setDaemon(this.isDaemon);

        if (t.getPriority() != Thread.NORM_PRIORITY){

            t.setPriority(Thread.NORM_PRIORITY);
        }

        return t;
    }
}
