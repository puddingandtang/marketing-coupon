package com.tcl.marketing.coupon.common.exception;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 12:29 2019/3/15
 * @Modified By:
 * @Version :
 */
@Data
public class ErrorCode implements Serializable {

    private int code;

    private String message;

    public ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }
}