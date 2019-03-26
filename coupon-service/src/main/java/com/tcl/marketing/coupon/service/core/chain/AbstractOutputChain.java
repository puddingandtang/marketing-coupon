package com.tcl.marketing.coupon.service.core.chain;

import com.tcl.marketing.coupon.service.core.node.output.OutputNode;

import java.util.List;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 10:57 2019/3/26
 * @Modified By:
 * @Version :
 */
public abstract class AbstractOutputChain implements Chain {

    /**
     * 获取处理节点
     *
     * @return
     */
    protected abstract List<OutputNode> initNodes();

    @Override
    public void processChain() {

        List<OutputNode> curNodes = initNodes();

        for (OutputNode node : curNodes) {

            node.processOutput();
        }

    }
}
