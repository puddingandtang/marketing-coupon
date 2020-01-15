package com.tcl.marketing.coupon.common.type;

import lombok.Getter;

import java.util.Arrays;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 16:19 2019/3/26
 * @Modified By:
 * @Version :
 */
@Getter
public enum UserTypeEnum {

    CUSTOMER(1, "顾客");

    private int code;

    private String codeName;

    UserTypeEnum(int code, String codeName) {
        this.code = code;
        this.codeName = codeName;
    }

    public static UserTypeEnum acquire(final Integer code) {

        return Arrays.stream(UserTypeEnum.values()).filter(t -> null != code && t.getCode() == code.intValue()).findAny()
                .orElse(null);
    }
}
