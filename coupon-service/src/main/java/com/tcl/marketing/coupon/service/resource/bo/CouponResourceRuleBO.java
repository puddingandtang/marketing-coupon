package com.tcl.marketing.coupon.service.resource.bo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CouponResourceRuleBO implements Serializable {

    private Long id;

    private Long resourceId;

    private String ruleCode;

    private String ruleValue;

    private String version;
}
