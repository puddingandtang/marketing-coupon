package com.tcl.marketing.coupon.common.exception;

import static com.tcl.marketing.coupon.common.exception.ErrorCodes.DEFAULT_CHECK_COMMON_ERROR;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 16:16 2019/3/26
 * @Modified By:
 * @Version :
 */
public class PreconditionUtil {

    /***
     *
     * 满足表达式的情况,不抛异常.
     * @param expression
     * @param errorCode
     */
    public static void checkArgument(boolean expression, ErrorCode errorCode) {
        if (!expression) {
            throw new ParamCheckException(errorCode.getCode(), errorCode.getMessage());
        }
    }

    /***
     * 满足表达式的情况,不抛异常.
     * @param expression
     */
    public static void checkArgument(boolean expression, String message) {
        if (!expression) {
            throw new ParamCheckException(DEFAULT_CHECK_COMMON_ERROR.getCode(), message);
        }
    }

    /***
     * 满足表达式的情况,不抛异常.
     * @param expression
     */
    public static void checkArgument(boolean expression, String message, Object... arguments) {
        if (!expression) {
            throw new ParamCheckException(DEFAULT_CHECK_COMMON_ERROR.getCode(), message, arguments);
        }
    }

    /***
     * 满足表达式的情况,不抛异常.
     * @param expression
     * @param errorCode
     * @param arguments
     */
    public static void checkArgument(boolean expression, ErrorCode errorCode, Object... arguments) {
        if (!expression) {
            throw new ParamCheckException(errorCode.getCode(), errorCode.getMessage(), arguments);
        }
    }

    /***
     * 满足表达式的情况,不抛异常.
     * @param expression
     * @param errorMessage
     */
    public static void checkArgument(boolean expression, int code, Object errorMessage) {
        if (!expression) {
            throw new ParamCheckException(code, String.valueOf(errorMessage));
        }
    }

    /***
     * 满足表达式的情况,直接抛异常.
     * @param expression
     * @param errorCode
     */
    public static void matchErrorCase(boolean expression, ErrorCode errorCode) {
        if (expression) {
            throw new ParamCheckException(errorCode.getCode(), errorCode.getMessage());
        }
    }

    /***
     * 满足表达式的情况,直接抛异常.
     * @param expression
     * @param errorMessage
     */
    public static void matchErrorCase(boolean expression, int code, Object errorMessage) {
        if (expression) {
            throw new ParamCheckException(code, String.valueOf(errorMessage));
        }
    }

    /**
     * 检查业务状态
     *
     * @param expression
     * @param code
     * @param errorMessage
     */
    public static void checkState(boolean expression, int code, Object errorMessage) {

        if (!expression) {

            throw new BizException(code, String.valueOf(errorMessage));

        }
    }

    /**
     * 检查业务状态
     *
     * @param expression
     * @param errorMessage
     */
    public static void checkState(boolean expression, Object errorMessage) {

        if (!expression) {

            throw new BizException(String.valueOf(errorMessage));

        }
    }

    /**
     * 检查业务状态
     *
     * @param expression
     * @param errorCode
     * @param arguments
     */
    public static void checkState(boolean expression, ErrorCode errorCode, Object... arguments) {

        if (!expression) {

            throw new BizException(errorCode.getCode(), errorCode.getMessage(), arguments);

        }
    }

}

