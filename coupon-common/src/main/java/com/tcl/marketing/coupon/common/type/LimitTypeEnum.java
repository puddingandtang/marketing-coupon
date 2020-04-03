package com.tcl.marketing.coupon.common.type;

import lombok.Getter;

import java.util.Arrays;

@Getter
public enum LimitTypeEnum {

    NOT_LIMIT(1, "无限制"),

    CUR_LIMIT(2, "当前限制"),

    CUR_LIMIT_BACK(3, "当前限制-反面");

    private int code;

    private String codeName;

    LimitTypeEnum(int code, String codeName) {
        this.code = code;
        this.codeName = codeName;
    }

    public static LimitTypeEnum acquire(final Integer code) {

        return Arrays.stream(LimitTypeEnum.values()).filter(t -> null != code && t.getCode() == code.intValue()).findAny()
                .orElse(null);
    }
}
