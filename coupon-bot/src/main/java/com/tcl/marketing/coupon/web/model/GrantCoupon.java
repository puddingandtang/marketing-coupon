package com.tcl.marketing.coupon.web.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 0:08 2019/3/26
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
