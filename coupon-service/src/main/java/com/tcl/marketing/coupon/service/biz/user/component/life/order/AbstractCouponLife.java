package com.tcl.marketing.coupon.service.biz.user.component.life.order;

import com.alibaba.fastjson.JSON;
import com.tcl.marketing.coupon.common.exception.BssRuntimeException;
import com.tcl.marketing.coupon.common.exception.ErrorLevel;
import com.tcl.marketing.coupon.service.biz.user.component.life.CouponLifeContext;
import com.tcl.marketing.coupon.service.biz.user.component.life.CouponLifeResult;
import lombok.extern.slf4j.Slf4j;

import java.util.Optional;

import static com.tcl.marketing.coupon.common.exception.ErrorCodes.*;

/**
 * @program: marketing-coupon
 * @description: 券生命周期操作
 * @author: Mr.Tang
 * @create: 2020-05-23 13:27
 * @version:
 **/
@Slf4j
public abstract class AbstractCouponLife {

    /**
     * 执行核销
     *
     * @param context
     */
    public CouponLifeResult process(CouponLifeContext context) {

        CouponLifeResult result = new CouponLifeResult();

        try {

            processLifeBefore(context, result);

            // 中断校验
            if (result.getInterruptNullDefault(Boolean.FALSE)) {
                return result;
            }

            processLife(context, result);

            // 中断校验
            if (result.getInterruptNullDefault(Boolean.FALSE)) {
                return result;
            }

            processLifeAfter(context, result);

            return result;

        } catch (BssRuntimeException bssEx) {

            Integer errorCode = bssEx.getErrorCode();
            String errorMsg = bssEx.getMessage();

            result.setCode(errorCode);
            result.setMsg(errorMsg);

            ErrorLevel errorLevel = Optional.of(bssEx.getErrorLevel()).orElse(ErrorLevel.ERROR);

            if (ErrorLevel.ERROR == errorLevel) {

                log.error("执行AbstractCouponLife#process#BssRuntimeException, lifeContext= " + JSON.toJSONString(context) + " , lifeResult= " + JSON.toJSONString(result) + " , 异常", bssEx);

            } else {

                log.info("执行AbstractCouponLife#process#BssRuntimeException, lifeContext= {} , lifeResult= {} , 失败码= {} , 失败信息= {}" , JSON.toJSONString(context), JSON.toJSONString(result), bssEx.getErrorCode(), bssEx.getMessage());
            }

            return result;

        } catch (Exception ex) {

            log.error("执行AbstractCouponLife#process#Exception, lifeContext= " + JSON.toJSONString(context) + " , lifeResult= " + JSON.toJSONString(result) + " , 异常", ex);

            result.setCode(LIFE_COUPON_SYSTEM_ERROR.getCode());
            result.setMsg(LIFE_COUPON_SYSTEM_ERROR.getMessage());

            return result;
        }

    }

    /**
     * 执行前
     */
    protected CouponLifeResult processLifeBefore(CouponLifeContext lifeContext, CouponLifeResult lifeResult) {

        return lifeResult;
    }

    /**
     * 执行具体生命周期的业务
     *
     * @param lifeContext
     * @return
     */
    protected abstract CouponLifeResult processLife(CouponLifeContext lifeContext, CouponLifeResult lifeResult);

    /**
     * 执行后
     *
     * @param lifeContext
     */
    protected CouponLifeResult processLifeAfter(CouponLifeContext lifeContext, CouponLifeResult lifeResult) {

        return lifeResult;
    }


}
