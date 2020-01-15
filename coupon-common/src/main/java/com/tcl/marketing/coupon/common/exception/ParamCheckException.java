package com.tcl.marketing.coupon.common.exception;

import lombok.EqualsAndHashCode;

import java.text.MessageFormat;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 12:30 2019/3/15
 * @Modified By:
 * @Version :
 */
@EqualsAndHashCode(callSuper = false)
public class ParamCheckException extends BssRuntimeException {
    /***
     * 异常构建
     *
     * @param message   异常消息
     */
    public ParamCheckException(String message) {
        this.errorCode = DEFAULT_CHECK_COMMON_ERROR.getCode();
        this.message = message;
    }

    /***
     * 异常构建
     *
     * @param errorCode 异常码
     * @param message   异常消息
     */
    public ParamCheckException(int errorCode, String message) {
        this.errorCode = errorCode;
        this.message = message;
    }

    /***
     * 异常构建
     *
     * @param errorCode 异常码
     * @param message   异常消息
     */
    public ParamCheckException(int errorCode, String message, ErrorLevel errorLevel) {
        this.errorCode = errorCode;
        this.message = message;
        this.errorLevel = errorLevel;

    }

    /***
     * 异常构建,支持替换变量
     *
     * @param errorCode 异常码
     * @param message   异常消息
     */
    public ParamCheckException(int errorCode, String message, Object... arguments) {
        this.errorCode = errorCode;
        this.message = MessageFormat.format(message, arguments);
    }

    @Override
    public String getExceptionType() {
        return PARAM_CHECK_EXCEPTION;
    }
}
