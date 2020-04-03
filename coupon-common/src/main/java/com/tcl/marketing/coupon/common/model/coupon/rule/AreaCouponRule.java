package com.tcl.marketing.coupon.common.model.coupon.rule;

import com.tcl.marketing.coupon.common.model.AreaInfo;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 区域规则：电子围栏
 */
@Data
public class AreaCouponRule extends BaseRule implements Serializable {

    /**
     * 1.无限制
     * 2.指定限制
     * 3.指定限制-反选
     * {@link com.tcl.marketing.coupon.common.type.LimitTypeEnum}
     */
    private Integer limitType;

    private List<AreaInfo> areas;

}
