package com.tcl.marketing.coupon.common.coupon;

import com.tcl.marketing.coupon.common.coupon.type.CouponTypeEnum;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 16:28 2019/3/25
 * @Modified By:
 * @Version :
 */
@Data
public class BaseCoupon implements Serializable {

    /**
     * 券类型
     *
     * @see CouponTypeEnum
     */
    private Integer type;

    /**
     * 上限
     */
    private long maxMoney;

    /**
     * 下限
     */
    private long minMoney;

}
