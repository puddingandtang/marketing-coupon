package com.tcl.marketing.coupon.service.biz.user;

public interface UserCouponPackageService {

    void lookUpAvailableCouponList(Long userNo, Integer userType, Integer couponKind, Long curIdx, Long size);
}
