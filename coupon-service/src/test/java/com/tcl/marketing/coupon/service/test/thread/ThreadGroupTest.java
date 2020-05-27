package com.tcl.marketing.coupon.service.test.thread;

import com.alibaba.fastjson.JSON;

/**
 * @program: marketing-coupon
 * @description:
 * @author: Mr.Tang
 * @create: 2020-05-26 16:38
 * @version:
 **/
public class ThreadGroupTest {

    public static void main(String[] args) {

        ThreadGroupTest groupTest = new ThreadGroupTest();

        // 线程组了解
        groupTest.threadGroup();

        // system.arrayCopy了解
        groupTest.systemArrayCopy();

    }

    public void threadGroup() {

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {

                    boolean is = Thread.currentThread().isInterrupted();
                    while (!is) {

                        is = Thread.currentThread().isInterrupted();
                    }

                    System.out.println("断了1");
                    Thread.currentThread().interrupt();

                } catch (Exception e) {

                    e.printStackTrace();
                    Thread.currentThread().interrupt();
                }

            }
        });
        thread1.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {

                    boolean is = Thread.currentThread().isInterrupted();
                    while (!is) {

                        is = Thread.currentThread().isInterrupted();
                    }

                    System.out.println("断了2");
                    Thread.currentThread().interrupt();

                } catch (Exception e) {
                    e.printStackTrace();
                    Thread.currentThread().interrupt();
                }

            }
        });
        thread2.start();

        System.out.println("thread1:" + thread1.isInterrupted());
        System.out.println("thread2:" + thread2.isInterrupted());


        ThreadGroup threadGroup1 = Thread.currentThread().getThreadGroup();

        System.out.println("activeCount:" + threadGroup1.activeCount());

        threadGroup1.interrupt();

        for (; ; ) {

            boolean t1 = thread1.isInterrupted();
            boolean t2 = thread2.isInterrupted();

            if (t1 && t2) {
                // System.out.println("t1,t2 中断" + t1 + " " + t2);
                break;
            }

        }

        System.out.println("thread1:" + thread1.isInterrupted());
        System.out.println("thread2:" + thread2.isInterrupted());

        System.out.println();
    }

    public void systemArrayCopy() {

        int[] origin = {1, 2, 3, 4, 5, 6};

        int[] dest = new int[10];

        // dest.length >= origin.length

        System.arraycopy(origin, 5, dest, 3, 1);

        System.out.println(JSON.toJSONString(dest));
    }
    
}
