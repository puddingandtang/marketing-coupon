package com.tcl.marketing.coupon.common.model.coupon.rule;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 17:05 2019/3/25
 * @Modified By:
 * @Version :
 * <p>
 * <p>
 * 优惠券的规则继承该类
 */
@Data
public class BaseRule implements Serializable {

    /**
     * 规则编码
     */
    private String ruleCode;

    /**
     * 版本号
     * 默认版本 ：1.0
     */
    private String version = "1.0";

    /**
     * 关闭标识
     * 1.未关闭
     * 2.关闭
     */
    private Integer closeFlag = 1;

}
