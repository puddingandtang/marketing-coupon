package com.tcl.marketing.coupon.common.model.coupon.rule;

import com.tcl.marketing.coupon.common.model.TimeBucket;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 时间使用规则
 */
@Data
public class TimeCouponRule extends BaseRule implements Serializable {

    /**
     * 时段
     */
    private List<TimeBucket> buckets;

    /**
     * 周几
     */
    private List<Integer> weeks;

    /**
     * 月 几号
     */
    private List<Integer> monthDays;


}
