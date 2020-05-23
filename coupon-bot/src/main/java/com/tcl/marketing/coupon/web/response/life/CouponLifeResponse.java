package com.tcl.marketing.coupon.web.response.life;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @program: marketing-coupon
 * @description:
 * @author: Mr.Tang
 * @create: 2020-05-23 13:09
 * @version:
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CouponLifeResponse implements Serializable {

    /**
     * 用户编号
     */
    private Long userNo;

    /**
     * 用户类型
     */
    private Integer userType;

    /**
     * 券编号
     */
    private Long couponNo;

}
