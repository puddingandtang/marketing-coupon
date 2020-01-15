package com.tcl.marketing.coupon.common.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 16:04 2019/3/25
 * @Modified By:
 * @Version :
 */
@Data
public class RpcResult<T> implements Serializable {

    /**
     * 成功码
     */
    private static final int REST_SUCCESS_CODE = 200;

    /**
     * 调用错误信息
     */
    private String message;

    /**
     * 返回码
     */
    private int code;

    /**
     * 返回数据
     */
    private T data;

    public RpcResult() {
    }

    public RpcResult(T data) {
        this.code = REST_SUCCESS_CODE;
        this.message = null;
        this.data = data;
    }

    public RpcResult(String message, int code, T data) {
        this.message = message;
        this.code = code;
        this.data = data;
    }

    public RpcResult<T> failure(Integer errorCode, String errorMsg) {

        this.message = errorMsg;
        this.code = errorCode;
        this.data = null;
        return this;
    }

    public RpcResult<T> success(T data) {

        this.message = null;
        this.code = REST_SUCCESS_CODE;
        this.data = data;

        return this;
    }
}
