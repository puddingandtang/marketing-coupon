package com.tcl.marketing.coupon.common.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 15:16 2019/3/26
 * @Modified By:
 * @Version :
 */
@Data
public class GrantCoupon implements Serializable {

    /**
     * 优惠劵模板编码
     */
    private Long couponTempId;

    /**
     * 优惠劵数量
     */
    private Integer couponNum;

}

