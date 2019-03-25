package com.tcl.marketing.coupon.common.exception;

import lombok.Data;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 12:29 2019/3/15
 * @Modified By:
 * @Version :
 */
@Data
public abstract class BssRuntimeException extends RuntimeException {

    public static final ErrorCode DEFAULT_BIZ_COMMON_ERROR = new ErrorCode(100003, "业务异常");
    public static final ErrorCode DEFAULT_CHECK_COMMON_ERROR = new ErrorCode(100004, "参数不合法");

    public static final String PARAM_CHECK_EXCEPTION = "ParamCheckException";

    public static final String BIZ_EXCEPTION = "BizException";


    public BssRuntimeException(){}


    protected String message;

    protected int errorCode;

    protected ErrorLevel errorLevel = ErrorLevel.INFO;

    public abstract String getExceptionType();
}