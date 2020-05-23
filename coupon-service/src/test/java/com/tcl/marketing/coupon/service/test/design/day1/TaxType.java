package com.tcl.marketing.coupon.service.test.design.day1;

import lombok.Getter;

@Getter
public enum TaxType {
    A(1, "A"),
    B(2, "B"),
    ;

    private int code;

    private String desc;

    TaxType(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
