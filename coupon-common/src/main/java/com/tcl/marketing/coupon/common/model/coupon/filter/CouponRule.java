package com.tcl.marketing.coupon.common.model.coupon.filter;

import com.tcl.marketing.coupon.common.model.coupon.rule.BaseRule;
import lombok.Data;

import java.io.Serializable;
import java.util.Map;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 19:08 2019/3/25
 * @Modified By:
 * @Version :
 */
@Data
public class CouponRule implements Serializable {

    /**
     * 模板编号
     */
    private Long templateId;

    /**
     * 规则集合
     */
    private Map<String, BaseRule> rules;
}
