package com.tcl.marketing.coupon.service.core.node.output;

import com.tcl.marketing.coupon.service.CouponGrantService;
import com.tcl.marketing.coupon.service.core.model.GrantContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 11:07 2019/3/26
 * @Modified By:
 * @Version :
 */
@Slf4j
@Component
public class GrantOutputNode implements OutputNode<GrantContext> {

    @Resource
    CouponGrantService couponGrantService;

    @Override
    public void processOutput(GrantContext context) {
        log.info("发放输出");
    }
}
