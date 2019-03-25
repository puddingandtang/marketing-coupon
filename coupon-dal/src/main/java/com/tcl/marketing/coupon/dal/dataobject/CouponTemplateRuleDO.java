package com.tcl.marketing.coupon.dal.dataobject;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 16:19 2019/3/25
 * @Modified By:
 * @Version :
 */
@Data
public class CouponTemplateRuleDO implements Serializable {

    private Long id;

    private Long templateId;

    private String ruleCode;

    private String ruleContent;

    private Date createTime;

    private Date updateTime;
}
