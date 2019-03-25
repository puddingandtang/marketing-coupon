package com.tcl.marketing.coupon.common.exception;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 12:30 2019/3/15
 * @Modified By:
 * @Version :
 */
public enum ErrorLevel {

    DEBUG(1), INFO(2), WARN(3), ERROR(4);

    private final int value;

    private ErrorLevel(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public static ErrorLevel findByValue(int value) {
        switch (value) {
        case 1:
            return DEBUG;
        case 2:
            return INFO;
        case 3:
            return WARN;
        case 4:
            return ERROR;
        default:
            return null;
        }
    }
}
