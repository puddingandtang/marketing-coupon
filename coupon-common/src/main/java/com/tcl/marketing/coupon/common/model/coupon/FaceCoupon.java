package com.tcl.marketing.coupon.common.model.coupon;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 16:41 2019/3/25
 * @Modified By:
 * @Version :
 */
@Data
public class FaceCoupon extends BaseCoupon implements Serializable {

    /**
     * 面值
     */
    private long money;

}
