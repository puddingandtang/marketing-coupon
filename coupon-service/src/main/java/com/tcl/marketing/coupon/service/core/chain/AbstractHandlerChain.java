package com.tcl.marketing.coupon.service.core.chain;

import com.tcl.marketing.coupon.service.core.node.handler.HandlerNode;

import java.util.List;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 10:55 2019/3/26
 * @Modified By:
 * @Version :
 */
public abstract class AbstractHandlerChain implements Chain {

    /**
     * 获取处理节点
     *
     * @return
     */
    protected abstract List<HandlerNode> initNodes();

    @Override
    public void processChain() {

        List<HandlerNode> curNodes = initNodes();

        for (HandlerNode node : curNodes) {

            node.processHandler();
        }

    }
}
