package com.tcl.marketing.coupon.common.coupon;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 16:39 2019/3/25
 * @Modified By:
 * @Version :
 */
@Data
public class DiscountCoupon extends BaseCoupon implements Serializable {

    /**
     * 折扣
     */
    private int discount;

}
