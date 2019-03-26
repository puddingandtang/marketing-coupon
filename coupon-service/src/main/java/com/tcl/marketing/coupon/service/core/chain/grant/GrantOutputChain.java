package com.tcl.marketing.coupon.service.core.chain.grant;

import com.google.common.collect.Lists;
import com.tcl.marketing.coupon.service.core.chain.AbstractOutputChain;
import com.tcl.marketing.coupon.service.core.node.output.GrantOutputNode;
import com.tcl.marketing.coupon.service.core.node.output.OutputNode;
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
public class GrantOutputChain extends AbstractOutputChain {

    @Resource
    GrantOutputNode grantOutputNode;

    @Override
    protected List<OutputNode> initNodes() {
        return Lists.newArrayList(grantOutputNode);
    }
}
