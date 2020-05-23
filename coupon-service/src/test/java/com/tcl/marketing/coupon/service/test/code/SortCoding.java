package com.tcl.marketing.coupon.service.test.code;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

public class SortCoding {

    // https://www.cnblogs.com/guoyaohua/p/8600214.html

    /**
     * 冒泡排序
     * 1.比较相邻的元素。如果第一个比第二个大，就交换它们两个；
     * 2.对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对，这样在最后的元素应该会是最大的数；
     * 3.针对所有的元素重复以上的步骤，除了最后一个；
     * 4.重复步骤1~3，直到排序完成。
     *
     * @param origin
     * @return
     */
    public static final List<Integer> 冒泡排序(List<Integer> origin) {

        if (null == origin) {

            return null;
        }

        Integer size = origin.size();

        // 这个for循环是处理的每个元素
        for (int x = 0; x < size; x++) {

            for (int j = 0; j < size - 1 - x; j++) {

                Integer a = origin.get(j);
                Integer b = origin.get(j + 1);
                if (a > b) {

                    origin.set(j + 1, a);
                    origin.set(j, b);
                }
            }


        }

        return origin;
    }

    @Test
    public void 冒泡排序() {

        System.out.println(冒泡排序(Lists.newArrayList(1, 2, 3, 4, 5, 6)));
        System.out.println(冒泡排序(Lists.newArrayList(1, 2, 3, 4, 5, 6, 0)));
        System.out.println(冒泡排序(Lists.newArrayList(7, 6, 5, 4, 3, 2, 1)));
    }

    /**
     * 选择排序
     * 初始状态：无序区为R[1..n]，有序区为空；
     * 第i趟排序(i=1,2,3…n-1)开始时，当前有序区和无序区分别为R[1..i-1]和R(i..n）。该趟排序从当前无序区中-选出关键字最小的记录 R[k]，将它与无序区的第1个记录R交换，使R[1..i]和R[i+1..n)分别变为记录个数增加1个的新有序区和记录个数减少1个的新无序区；
     * n-1趟结束，数组有序化了。
     *
     * @param origin
     * @return
     */
    public static final List<Integer> 选择排序(List<Integer> origin) {

        if (null == origin) {
            return null;
        }

        int size = origin.size();
        // 第一个for是表示要处理的元素
        for (int idx = 0; idx < size; idx++) {

            int curMinIdx = idx;

            for (int minIdx = idx; minIdx < size; minIdx++) {

                int a = origin.get(minIdx);
                int b = origin.get(curMinIdx);
                if (a < b) {

                    curMinIdx = minIdx;
                }
            }

            if (idx < curMinIdx) {

                int a = origin.get(idx);
                int b = origin.get(curMinIdx);
                // 这时候才进行交换
                origin.set(idx, b);
                origin.set(curMinIdx, a);
            }
        }

        return origin;
    }

    @Test
    public void 选择排序() {

        // System.out.println(选择排序(Lists.newArrayList(1, 2, 3, 4, 5, 6)));
        System.out.println(选择排序(Lists.newArrayList(1, 6, 0)));
        // System.out.println(选择排序(Lists.newArrayList(7, 6, 5, 4, 3, 2, 1)));
    }


    public static final int 快速排序(List<Integer> origin, Integer leftIdx, Integer rightIdx) {

        Integer i = leftIdx;
        Integer j = rightIdx;
        Integer flagValue = origin.get(leftIdx);

        if (leftIdx < rightIdx) {

            while (i < j) {
                // 如果rightValue大于flagValue，则rightIdx--，直到碰到小于flagValue
                while (i < j && origin.get(j) >= flagValue) {
                    j--;
                }
                if (i < j) {
                    origin.set(i, origin.get(j));
                    i++;
                }

                // 如果leftValue小于flagValue，则leftValue++，直到碰到小于flagValue
                while (i < j && origin.get(i) < flagValue) {
                    i++;
                }
                if (i < j) {

                    origin.set(j, origin.get(i));
                    j--;
                }

            }

            origin.set(i, flagValue);
        }

        System.out.println(origin);
        return i;
    }

    @Test
    public void 快速排序() {
        List<Integer> list = Lists.newArrayList(3, 6, 0, 7, 1);

        int i = 快速排序(list, 0, 4);//先成挖坑填数法调整s[]

        System.out.println(i);

    }
}
