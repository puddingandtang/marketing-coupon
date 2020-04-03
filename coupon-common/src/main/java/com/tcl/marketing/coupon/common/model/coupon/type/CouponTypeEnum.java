package com.tcl.marketing.coupon.common.model.coupon.type;

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

    DISCOUNT(CouponKindEnum.DEFAULT_COUPON.getCode(), 1, "折扣券"),

    FACE(CouponKindEnum.DEFAULT_COUPON.getCode(), 2, "面值券"),

    EXPERIENCE(CouponKindEnum.DEFAULT_COUPON.getCode(), 3, "体验券");

    private int kind;

    private int code;

    private String desc;

    CouponTypeEnum(int kind, int code, String desc) {

        this.kind = kind;
        this.code = code;
        this.desc = desc;
    }


    /**
     * 获取类型
     *
     * @param kind
     * @param code
     * @return
     */
    public static final CouponTypeEnum acquire(final Integer kind, final Integer code) {

        return Arrays.stream(CouponTypeEnum.values())
                .filter(t1 -> null != kind && kind.intValue() == t1.getKind())
                .filter(t2 -> null != code && code.intValue() == t2.getCode()).findFirst()
                .orElse(null);

    }

}
