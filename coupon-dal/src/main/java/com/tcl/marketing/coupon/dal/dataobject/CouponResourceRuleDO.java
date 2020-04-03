package com.tcl.marketing.coupon.dal.dataobject;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class CouponResourceRuleDO implements Serializable {

    private Long id;

    private Long templateId;

    private String ruleCode;

    private String ruleContent;

    private String version;

    private Date createTime;

    private Date updateTime;
}
