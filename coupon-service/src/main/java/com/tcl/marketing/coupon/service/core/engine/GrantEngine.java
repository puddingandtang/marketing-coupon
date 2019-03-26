package com.tcl.marketing.coupon.service.core.engine;

import com.google.common.collect.Lists;
import com.tcl.marketing.coupon.service.core.chain.Chain;
import com.tcl.marketing.coupon.service.core.chain.grant.GrantCheckChain;
import com.tcl.marketing.coupon.service.core.chain.grant.GrantHandlerChain;
import com.tcl.marketing.coupon.service.core.chain.grant.GrantInputChain;
import com.tcl.marketing.coupon.service.core.chain.grant.GrantOutputChain;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 10:00 2019/3/26
 * @Modified By:
 * @Version :
 * <p>
 * <p>
 * 券发放引擎
 */
@Slf4j
@Component
public class GrantEngine extends AbstractEngine {

    @Resource
    GrantInputChain grantInputChain;

    @Resource
    GrantCheckChain grantCheckChain;

    @Resource
    GrantHandlerChain grantHandlerChain;

    @Resource
    GrantOutputChain grantOutputChain;

    @Override
    protected List<Chain> initChain() {

        List<Chain> chains = Lists.newArrayList(grantInputChain, grantCheckChain, grantHandlerChain, grantOutputChain);

        return chains;
    }

}
