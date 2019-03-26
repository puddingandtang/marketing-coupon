package com.tcl.marketing.coupon.service.core.node.input;

import com.tcl.marketing.coupon.service.CouponGrantService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 11:04 2019/3/26
 * @Modified By:
 * @Version :
 */
@Slf4j
@Component
public class GrantInputNode implements InputNode {

    @Resource
    CouponGrantService couponGrantService;

    @Override
    public void processInput() {
        couponGrantService.oneGrant();
        log.info("发放输入");
    }
}
