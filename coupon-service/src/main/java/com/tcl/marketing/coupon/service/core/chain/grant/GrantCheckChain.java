package com.tcl.marketing.coupon.service.core.chain.grant;

import com.google.common.collect.Lists;
import com.tcl.marketing.coupon.service.core.chain.AbstractCheckChain;
import com.tcl.marketing.coupon.service.core.node.check.CheckNode;
import com.tcl.marketing.coupon.service.core.node.check.GrantCheckNode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 10:26 2019/3/26
 * @Modified By:
 * @Version :
 */
@Slf4j
@Component
public class GrantCheckChain extends AbstractCheckChain {

    @Resource
    GrantCheckNode grantCheckNode;

    @Override
    protected List<CheckNode> initNodes() {

        return Lists.newArrayList(grantCheckNode);
    }
}
