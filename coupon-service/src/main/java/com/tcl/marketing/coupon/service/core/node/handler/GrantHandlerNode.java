package com.tcl.marketing.coupon.service.core.node.handler;

import com.tcl.marketing.coupon.service.CouponGrantService;
import com.tcl.marketing.coupon.service.core.model.GrantContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 11:02 2019/3/26
 * @Modified By:
 * @Version :
 */
@Slf4j
@Component
public class GrantHandlerNode implements HandlerNode<GrantContext> {

    @Resource
    CouponGrantService couponGrantService;

    @Override
    public void processHandler(GrantContext context) {
        couponGrantService.oneGrant();
        log.info("发放核心");
    }
}
