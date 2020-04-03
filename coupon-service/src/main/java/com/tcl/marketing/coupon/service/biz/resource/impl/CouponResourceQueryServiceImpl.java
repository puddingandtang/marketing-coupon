package com.tcl.marketing.coupon.service.biz.resource.impl;

import com.tcl.marketing.coupon.service.biz.resource.CouponResourceQueryService;
import com.tcl.marketing.coupon.service.biz.resource.bo.CouponResourceAssemblyBO;
import com.tcl.marketing.coupon.service.biz.resource.component.CouponResourceCache;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Slf4j
@Service
public class CouponResourceQueryServiceImpl implements CouponResourceQueryService {

    @Resource
    CouponResourceCache couponResourceCache;

    @Override
    public CouponResourceAssemblyBO lookupDetail(Long resourceId) {

        return couponResourceCache.get(resourceId);
    }
}
