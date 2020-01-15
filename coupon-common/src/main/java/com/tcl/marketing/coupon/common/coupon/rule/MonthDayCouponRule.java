package com.tcl.marketing.coupon.common.coupon.rule;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 18:03 2019/3/25
 * @Modified By:
 * @Version :
 */
@Data
public class MonthDayCouponRule extends BaseRule implements Serializable {

    /**
     * 月 几号
     */
    private List<Integer> monthDays;
}
