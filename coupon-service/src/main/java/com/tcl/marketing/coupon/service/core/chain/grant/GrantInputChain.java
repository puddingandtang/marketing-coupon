package com.tcl.marketing.coupon.service.core.chain.grant;

import com.google.common.collect.Lists;
import com.tcl.marketing.coupon.service.core.chain.AbstractInputChain;
import com.tcl.marketing.coupon.service.core.node.input.GrantInputNode;
import com.tcl.marketing.coupon.service.core.node.input.InputNode;
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
public class GrantInputChain extends AbstractInputChain {

    @Resource
    GrantInputNode grantInputNode;

    @Override
    protected List<InputNode> initNodes() {
        return Lists.newArrayList(grantInputNode);
    }
}
