package com.tcl.marketing.coupon.dal.dataobject;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CouponResourceRuleDO implements Serializable {

    private Long id;

    private Long templateId;

    private String ruleCode;

    private String ruleContent;

    private Date createTime;

    private Date updateTime;
}
