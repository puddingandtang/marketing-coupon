package com.tcl.marketing.coupon.web.request.life;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @program: marketing-coupon
 * @description:
 * @author: Mr.Tang
 * @create: 2020-05-23 13:08
 * @version:
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CouponLifeRequest implements Serializable {

    /**
     * 业务线||业务编码
     * 即每个业务系统
     */
    private Integer bizCode;

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

    /**
     * 订单信息
     * 冻结，核销场景需要传
     */
    private String orderInfo;


}
