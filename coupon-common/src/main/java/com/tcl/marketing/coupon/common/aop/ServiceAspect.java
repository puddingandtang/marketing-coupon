package com.tcl.marketing.coupon.common.aop;

import com.tcl.marketing.coupon.common.component.common.TraceClass;
import com.tcl.marketing.coupon.common.exception.BizException;
import com.tcl.marketing.coupon.common.exception.BssRuntimeException;
import com.tcl.marketing.coupon.common.model.RpcResult;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import static com.tcl.marketing.coupon.common.exception.ErrorCodes.OTHER_EXCEPTION;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 12:26 2019/3/15
 * @Modified By:
 * @Version :
 */
@Slf4j
@Aspect
@Component
@Order(value = Ordered.HIGHEST_PRECEDENCE)
public class ServiceAspect extends TraceClass {

    @Around("@annotation(ServiceResultAop)")
    public Object process(ProceedingJoinPoint joinPoint) {

        Object obj = null;
        long startTime = System.currentTimeMillis();

        try {

            this.consumerTrace();

            obj = joinPoint.proceed();

        } catch (Throwable ex) {

            obj = handlerException(joinPoint, ex);

        } finally {

            long costTime = System.currentTimeMillis() - startTime;

            log.info("请求接口耗时:[{}]", costTime);
            this.afterTrace();

        }
        return obj;
    }

    private Object handlerException(ProceedingJoinPoint pjp, Throwable exception) {

        BssRuntimeException bssRuntimeException;

        if (exception instanceof BssRuntimeException) {

            bssRuntimeException = (BssRuntimeException) exception;

        } else {

            // 如果抛出的不是系统自定义的异常则重新构造一个未知错误异常
            bssRuntimeException = new BizException(OTHER_EXCEPTION);
        }

        //组装返回接口
        RpcResult rpcResult = new RpcResult().failure(bssRuntimeException.getErrorCode(), bssRuntimeException.getMessage());

        return rpcResult;

    }

}