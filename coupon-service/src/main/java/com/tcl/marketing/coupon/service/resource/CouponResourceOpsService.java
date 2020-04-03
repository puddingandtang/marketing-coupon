package com.tcl.marketing.coupon.service.resource;

import com.tcl.marketing.coupon.service.resource.bo.CouponResourceBO;
import com.tcl.marketing.coupon.service.resource.bo.CouponResourceBizBO;
import com.tcl.marketing.coupon.service.resource.bo.CouponResourceRuleBO;
import com.tcl.marketing.coupon.service.resource.bo.CouponResourceTerminalBO;

public interface CouponResourceOpsService {

    /**
     * 新增，如果存在则更新
     *
     * @param resourceBO
     * @param resourceTerminalBO
     * @param resourceBizBO
     * @param resourceRuleBO
     * @return
     */
    int addIfExistUpdate(CouponResourceBO resourceBO, CouponResourceTerminalBO resourceTerminalBO, CouponResourceBizBO resourceBizBO, CouponResourceRuleBO resourceRuleBO);

}
