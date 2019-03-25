package com.tcl.marketing.coupon.common.coupon.filter;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 19:06 2019/3/25
 * @Modified By:
 * @Version :
 */
@Data
@Builder
public class CouponFilter implements Serializable {

    /**
     * 过滤时间
     */
    private long filterTime;

    /**
     * 城市编码
     */
    private String cityCode;
}
