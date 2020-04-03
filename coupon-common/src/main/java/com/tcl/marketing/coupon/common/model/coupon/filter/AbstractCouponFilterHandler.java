package com.tcl.marketing.coupon.common.model.coupon.filter;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 17:42 2019/3/25
 * @Modified By:
 * @Version :
 * <p>
 * <p>
 * 过滤券继承该类
 */
@Slf4j
public abstract class AbstractCouponFilterHandler {

    /**
     * 执行过滤
     *
     * @param filter
     * @param rule
     * @return
     */
    public boolean filterProcess(CouponFilter filter, CouponRule rule) {

        return checkProcess(filter, rule);
    }

    /**
     * 子类实现
     *
     * @param filter
     * @param rule
     * @return
     */
    protected abstract boolean checkProcess(CouponFilter filter, CouponRule rule);

    protected boolean checkBase(CouponFilter filter, CouponRule rule) {

        return true;
    }

    protected boolean checkcombine(CouponFilter filter, CouponRule rule) {

        return true;
    }

    protected boolean checkTimeBucket(CouponFilter filter, CouponRule rule) {

        return true;
    }

    protected boolean checkWeek(CouponFilter filter, CouponRule rule) {

        return true;
    }

    protected boolean checkMonthDay(CouponFilter filter, CouponRule rule) {

        return true;
    }
}
