package com.tcl.marketing.coupon.common.coupon.rule;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 17:09 2019/3/25
 * @Modified By:
 * @Version :
 */
@Data
public class CityCouponRule extends BaseRule implements Serializable {

    /**
     * 1.全国
     * 2.指定城市可用
     * 3.指定城市不可用
     */
    private Integer range;

    /**
     * 可用
     */
    private List<String> usable;

    /**
     * 不可用
     */
    private List<String> unusable;
}
