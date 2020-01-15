package com.tcl.marketing.coupon.service.core.engine;

import com.google.common.collect.Lists;
import com.tcl.marketing.coupon.service.core.chain.Chain;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 14:43 2019/3/26
 * @Modified By:
 * @Version :
 */
@Slf4j
@Component("bestCouponEngine")
public class BestCouponEngine extends AbstractEngine {

    @Override
    protected List<Chain> initChain() {

        log.info("最优链路初始化");
        return Lists.newArrayList();
    }
}
