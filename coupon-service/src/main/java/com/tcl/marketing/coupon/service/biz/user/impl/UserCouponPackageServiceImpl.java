package com.tcl.marketing.coupon.service.biz.user.impl;

import com.tcl.marketing.coupon.service.biz.resource.CouponResourceQueryService;
import com.tcl.marketing.coupon.service.biz.user.UserCouponPackageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserCouponPackageServiceImpl implements UserCouponPackageService {

    @Resource
    CouponResourceQueryService couponResourceQueryService;

    @Override
    public void lookUpAvailableCouponList(Long userNo, Integer userType, Integer couponKind, Long curIdx, Long size) {


    }
}
