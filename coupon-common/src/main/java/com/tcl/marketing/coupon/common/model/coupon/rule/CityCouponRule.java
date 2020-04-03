package com.tcl.marketing.coupon.common.model.coupon.rule;

import com.tcl.marketing.coupon.common.model.CityInfo;
import com.tcl.marketing.coupon.common.type.LimitTypeEnum;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Author : chenglong.tang
 * @Description: 城市使用规则
 * @Date: Created in 17:09 2019/3/25
 * @Modified By:
 * @Version :
 */
@Data
public class CityCouponRule extends BaseRule implements Serializable {

    /**
     * 1.无限制
     * 2.指定限制
     * 3.指定限制-反选
     * {@link com.tcl.marketing.coupon.common.type.LimitTypeEnum}
     */
    private Integer limitType;

    /**
     * 当limitType == {@link LimitTypeEnum#CUR_LIMIT} or {@link LimitTypeEnum#CUR_LIMIT_BACK} ，才有意义
     */
    private List<CityInfo> cities;

}
