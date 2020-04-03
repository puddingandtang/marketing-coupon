package com.tcl.marketing.coupon.service.resource;

import com.tcl.marketing.coupon.service.resource.bo.CouponResourceAssemblyBO;

public interface CouponResourceQueryService {

    /**
     * 查找
     *
     * @param resourceId
     * @return
     */
    CouponResourceAssemblyBO lookupDetail(Long resourceId);

}
