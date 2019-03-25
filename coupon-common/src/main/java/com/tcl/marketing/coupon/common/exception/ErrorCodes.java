package com.tcl.marketing.coupon.common.exception;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 12:30 2019/3/15
 * @Modified By:
 * @Version :
 */
public class ErrorCodes {

    public static final ErrorCode OTHER_EXCEPTION = new ErrorCode(100_000, "未知异常");

    public static final ErrorCode DEFAULT_BIZ_COMMON_ERROR = new ErrorCode(100_003, "业务异常");

    public static final ErrorCode DEFAULT_CHECK_COMMON_ERROR = new ErrorCode(100_004, "参数不合法");

    public static final ErrorCode DEFAULT_CHECK_DATA_NOT_EXIST = new ErrorCode(100_005, "数据不存在");

    public static final ErrorCode AUTH_COMMON_ERROR = new ErrorCode(200_000, "{0}");

    public static final ErrorCode GROOVY_COMMON_ERROR = new ErrorCode(210_000, "{0}");

}
