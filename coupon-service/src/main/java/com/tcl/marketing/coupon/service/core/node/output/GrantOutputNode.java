package com.tcl.marketing.coupon.service.core.node.output;

import com.tcl.marketing.coupon.service.CouponGrantService;
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
public class GrantOutputNode implements OutputNode {

    @Resource
    CouponGrantService couponGrantService;

    @Override
    public void processOutput() {

        couponGrantService.oneGrant();
        log.info("发放输出");

    }
}
