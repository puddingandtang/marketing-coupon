package com.tcl.marketing.coupon.common.model.coupon;

import com.tcl.marketing.coupon.common.model.coupon.type.CouponKindEnum;
import com.tcl.marketing.coupon.common.model.coupon.type.CouponTypeEnum;
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
     * 券种类
     *
     * @see CouponKindEnum
     */
    private Integer kind;

    /**
     * 券类型
     *
     * @see CouponTypeEnum
     */
    private Integer type;

    /**
     * 金额：上限
     */
    private long maxMoney;

    /**
     * 金额：下限
     */
    private long minMoney;

    /**
     * 券一级标题
     */
    private String couponTitleOne;

    /**
     * 券二级标题
     */
    private String couponTitleTwo;

}
