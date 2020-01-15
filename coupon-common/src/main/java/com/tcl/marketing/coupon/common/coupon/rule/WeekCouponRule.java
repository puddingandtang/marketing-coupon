package com.tcl.marketing.coupon.common.coupon.rule;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 18:00 2019/3/25
 * @Modified By:
 * @Version :
 */
@Data
public class WeekCouponRule extends BaseRule implements Serializable {

    /**
     * 周几
     */
    private List<Integer> weeks;
}
