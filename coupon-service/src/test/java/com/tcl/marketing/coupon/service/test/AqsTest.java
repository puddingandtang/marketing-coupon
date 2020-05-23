package com.tcl.marketing.coupon.service.test;

import org.junit.Test;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

public class AqsTest {

    @Test
    public void semaphore() {

        // 默认非公平
        Semaphore semaphore = new Semaphore(1, true);
        try {

            semaphore.acquire(1);
            // semaphore.acquire(1);

        } catch (Exception e) {

            e.printStackTrace();

        } finally {

            semaphore.release(1);
        }
    }


    public static void main(String[] args) {


        final ReentrantLock reentrantLock = new ReentrantLock(true);

        new Thread(new Runnable() {
            @Override
            public void run() {

                System.out.println(Thread.currentThread().getName() + "获取锁");
                reentrantLock.lock();
                System.out.println(Thread.currentThread().getName() + "获取锁完成");

            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {

                System.out.println(Thread.currentThread().getName() + "获取锁");
                reentrantLock.lock();
                System.out.println(Thread.currentThread().getName() + "获取锁完成");
            }
        }).start();

        reentrantLock.unlock();
    }

}
