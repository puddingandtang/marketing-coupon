package com.tcl.marketing.coupon.service.biz.user.component.life.order;

import com.google.common.base.Strings;
import com.tcl.marketing.coupon.common.exception.*;
import com.tcl.marketing.coupon.dal.dataobject.CouponUseDO;
import com.tcl.marketing.coupon.dal.dataobject.UserCouponDO;
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

        Long couponNo = lifeContext.getCouponNo();

        // todo 根据用户编号，用户类型，券编号查询这张券
        UserCouponDO couponInfoFromDb = new UserCouponDO();

        if (null == couponInfoFromDb || Strings.isNullOrEmpty(couponInfoFromDb.getCouponNo())) {

            throw new BizException(ErrorCodes.LIFE_COUPON_NOT_EXIST, ErrorLevel.INFO);
        }

        Integer useStatus = couponInfoFromDb.getUseStatus();

        // todo 判断状态是否合法

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
