package com.tcl.marketing.coupon.common.coupon.type;

import lombok.Getter;

import java.util.Arrays;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 16:29 2019/3/25
 * @Modified By:
 * @Version :
 */
@Getter
public enum CouponTypeEnum {

    DISCOUNT(1, "折扣券"),

    FACE(2, "面值券"),

    EXPERIENCE(3, "体验券");

    private int code;

    private String desc;

    CouponTypeEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 查询
     *
     * @param code
     * @return
     */
    public static final CouponTypeEnum acquire(Integer code) {

        return Arrays.stream(CouponTypeEnum.values()).filter(t -> null != code && code.intValue() == t.getCode()).findFirst()
                .orElse(null);

    }

}
