package com.tcl.marketing.coupon.service.test.code;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

public class Coding {

    /**
     * 二分查找
     * 前提：集合有序
     *
     * @return
     */
    public static final Integer 二分查找_非递归_IDX(List<Integer> origin, Integer expectValue) {

        if (null == origin || origin.size() == 0 || null == expectValue) {

            return -1;
        }

        int headIdx = 0;
        int lastIdx = origin.size() - 1;

        while (headIdx <= lastIdx) {

            int midIdx = (headIdx + lastIdx) / 2;

            Integer head = origin.get(headIdx);
            Integer mid = origin.get(midIdx);
            Integer last = origin.get(lastIdx);

            if (mid == expectValue) {

                return midIdx;
            }

            if (mid > expectValue) {

                lastIdx = midIdx - 1;
                continue;
            }

            if (mid < expectValue) {

                headIdx = midIdx + 1;
                continue;
            }
        }

        return -1;


    }

    public static final Integer 二分查找_递归_IDX(List<Integer> origin, Integer expectValue, Integer headIdx, Integer lastIdx) {


        if (null == origin || origin.size() == 0 || null == expectValue || null == headIdx || null == lastIdx) {

            return -1;
        }

        if (headIdx > lastIdx) {

            return -1;
        }

        Integer headValue = origin.get(headIdx);
        Integer lastValue = origin.get(lastIdx);

        int idx = (lastIdx + headIdx) / 2;
        Integer midValue = origin.get(idx);

        if (midValue < expectValue) {

            return 二分查找_递归_IDX(origin, expectValue, midValue + 1, lastIdx);
        }

        if (midValue > expectValue) {

            return 二分查找_递归_IDX(origin, expectValue, headIdx, midValue - 1);
        }

        if (midValue == expectValue) {

            return idx;
        }

        return -1;


    }

    @Test
    public void 二分查找() {
        List<Integer> list = Lists.newArrayList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);

        System.out.println(二分查找_非递归_IDX(list, 7));
        System.out.println(二分查找_递归_IDX(list, 7, 0, 9));
    }
}
