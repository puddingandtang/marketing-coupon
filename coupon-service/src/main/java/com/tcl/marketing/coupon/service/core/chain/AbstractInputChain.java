package com.tcl.marketing.coupon.service.core.chain;

import com.tcl.marketing.coupon.service.core.node.input.InputNode;

import java.util.List;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 10:38 2019/3/26
 * @Modified By:
 * @Version :
 */
public abstract class AbstractInputChain implements Chain {

    /**
     * 获取处理节点
     *
     * @return
     */
    protected abstract List<InputNode> initNodes();

    @Override
    public void processChain() {

        List<InputNode> curNodes = initNodes();

        for (InputNode node : curNodes) {

            node.processInput();
        }

    }
}
