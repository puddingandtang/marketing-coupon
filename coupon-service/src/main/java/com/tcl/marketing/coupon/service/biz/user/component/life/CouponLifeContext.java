package com.tcl.marketing.coupon.service.biz.user.component.life;

import com.tcl.marketing.coupon.dal.dataobject.CouponUseDO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @program: marketing-coupon
 * @description:
 * @author: Mr.Tang
 * @create: 2020-05-23 13:30
 * @version:
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CouponLifeContext implements Serializable {

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
     * 从db里面查询券的基础信息
     */
    private CouponInfo dbCouponInfo;

}
