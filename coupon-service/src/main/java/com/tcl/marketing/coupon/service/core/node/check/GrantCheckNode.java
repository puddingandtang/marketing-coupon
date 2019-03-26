package com.tcl.marketing.coupon.service.core.node.check;

import com.tcl.marketing.coupon.service.CouponGrantService;
import com.tcl.marketing.coupon.service.core.model.GrantContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

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
    CouponGrantService couponGrantService;

    @Override
    public void processCheck(GrantContext context) {

        log.info("发放校验");
    }
}
