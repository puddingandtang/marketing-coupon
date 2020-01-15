package com.tcl.marketing.coupon.service.core.chain.grant;

import com.google.common.collect.Lists;
import com.tcl.marketing.coupon.service.core.chain.AbstractHandlerChain;
import com.tcl.marketing.coupon.service.core.node.check.GrantCheckNode;
import com.tcl.marketing.coupon.service.core.node.handler.GrantHandlerNode;
import com.tcl.marketing.coupon.service.core.node.handler.HandlerNode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 10:28 2019/3/26
 * @Modified By:
 * @Version :
 */
@Slf4j
@Component
public class GrantHandlerChain extends AbstractHandlerChain{

    @Resource
    GrantHandlerNode grantHandlerNode;

    @Override
    protected List<HandlerNode> initNodes() {
        return Lists.newArrayList(grantHandlerNode);
    }
}
