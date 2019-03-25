package com.tcl.marketing.coupon.common.coupon.rule;

import com.tcl.marketing.coupon.common.model.TimeBucket;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 17:47 2019/3/25
 * @Modified By:
 * @Version :
 */
@Data
public class TimeBucketCouponRule extends BaseRule implements Serializable {

    /**
     * 时段
     */
    private List<TimeBucket> buckets;

}
