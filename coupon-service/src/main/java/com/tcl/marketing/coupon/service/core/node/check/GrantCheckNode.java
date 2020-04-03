package com.tcl.marketing.coupon.service.core.node.check;

import com.google.common.base.Joiner;
import com.tcl.marketing.coupon.common.exception.ErrorCodes;
import com.tcl.marketing.coupon.common.type.UserTypeEnum;
import com.tcl.marketing.coupon.service.biz.grant.component.CouponGrantIdempotent;
import com.tcl.marketing.coupon.service.core.model.GrantContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

import static com.tcl.marketing.coupon.common.exception.PreconditionUtil.checkArgument;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 10:45 2019/3/26
 * @Modified By:
 * @Version :
 */
@Slf4j
@Component
public class GrantCheckNode implements CheckNode<GrantContext> {

    @Resource
    CouponGrantIdempotent couponGrantIdempotent;

    @Override
    public void processCheck(GrantContext context) {

        Long userNo = context.getUserNo();
        checkArgument(null != userNo, ErrorCodes.BASE_CHECK_COMMON_ERROR, "用户信息非法");
        Integer userType = context.getUserType();
        checkArgument(null != UserTypeEnum.acquire(userType), ErrorCodes.BASE_CHECK_COMMON_ERROR, "用户信息非法");

        // TODO 个人认为没必要进行用户uic校验，除非是将券发放接口通过开发网关进行对外开放

        // TODO 校验发放券合法性，例如发券数量，券模板是否存在，券模板是否启用等一系列券校验，券模板需要缓存

        // TODO 券库存预校验，券的发放数和库存数存在Redis中，如果查不到则查询DB

        String outTraceNo = context.getOutTraceNo();
        Integer grantBizType = context.getGrantBizType();
        String idempotent = Joiner.on("_").join(outTraceNo, String.valueOf(grantBizType));

        // 这里成立，则会构建一条发放记录，状态为待发放
        couponGrantIdempotent.checkGrantIdempotent(context);


    }
}
