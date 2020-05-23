package com.tcl.marketing.coupon.service.biz.user.component.life.order;

import com.tcl.marketing.coupon.common.exception.*;
import com.tcl.marketing.coupon.service.biz.user.component.life.CouponLifeContext;
import com.tcl.marketing.coupon.service.biz.user.component.life.CouponLifeResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import static com.tcl.marketing.coupon.service.biz.user.component.life.CouponLifeComponent.LIFE_FREEZE;

/**
 * @program: marketing-coupon
 * @description:
 * @author: Mr.Tang
 * @create: 2020-05-23 13:37
 * @version:
 **/

@Slf4j
@Component(value = LIFE_FREEZE)
public class CouponFreezeLife extends AbstractCouponLife {

    @Override
    protected CouponLifeResult processLifeBefore(CouponLifeContext lifeContext, CouponLifeResult lifeResult) {
        // todo 冻结场景，券合法性校验

        Long couponNo = lifeContext.getCouponNo();
        if(couponNo.intValue() == 1L){

            throw new BizException(ErrorCodes.LIFE_COUPON_NOT_EXIST, ErrorLevel.INFO);
        }

        if(couponNo.intValue() == 2L){

            throw new BizException(ErrorCodes.LIFE_COUPON_NOT_EXIST, ErrorLevel.ERROR);
        }

        if(couponNo.intValue() == 3L){

            System.out.println(1/0);
        }

        return super.processLifeBefore(lifeContext, lifeResult);
    }

    @Override
    protected CouponLifeResult processLife(CouponLifeContext lifeContext, CouponLifeResult lifeResult) {

        // todo 执行冻结

        return null;
    }

    @Override
    protected CouponLifeResult processLifeAfter(CouponLifeContext lifeContext, CouponLifeResult lifeResult) {

        // todo 后续业务
        return super.processLifeAfter(lifeContext, lifeResult);
    }
}
