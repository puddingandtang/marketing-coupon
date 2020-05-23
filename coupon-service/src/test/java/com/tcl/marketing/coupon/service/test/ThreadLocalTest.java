package com.tcl.marketing.coupon.service.test;

import org.junit.Test;

public class ThreadLocalTest {

    @Test
    public void threadLocalMap() {

        final ThreadLocal<String> threadLocal = new ThreadLocal<>();
        final ThreadLocal<String> threadLocal2 = new ThreadLocal<>();

        threadLocal.set(Thread.currentThread().getName() + "----1");

        System.gc();
        threadLocal.set(Thread.currentThread().getName() + "----1-1");

        System.out.println(threadLocal);
    }
}
