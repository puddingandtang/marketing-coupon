package com.tcl.marketing.coupon.service.biz.resource.bo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CouponResourceAssemblyBO implements Serializable {

    private Long resourceNo;

    private CouponResourceBO resourceBO;

    private CouponResourceTerminalBO resourceTerminalBO;

    private CouponResourceBizBO resourceBizBO;

    private CouponResourceRuleBO resourceRuleBO;

}
