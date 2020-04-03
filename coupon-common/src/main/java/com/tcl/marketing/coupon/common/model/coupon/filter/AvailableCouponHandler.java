package com.tcl.marketing.coupon.common.model.coupon.filter;

import org.springframework.stereotype.Component;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 19:21 2019/3/25
 * @Modified By:
 * @Version :
 */
@Component
public class AvailableCouponHandler extends AbstractCouponFilterHandler {

    @Override
    protected boolean checkProcess(CouponFilter filter, CouponRule rule) {
        return false;
    }
}
