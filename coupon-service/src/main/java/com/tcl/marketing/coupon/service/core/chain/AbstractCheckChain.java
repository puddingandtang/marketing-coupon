package com.tcl.marketing.coupon.service.core.chain;

import com.tcl.marketing.coupon.service.core.model.Context;
import com.tcl.marketing.coupon.service.core.node.check.CheckNode;

import java.util.List;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 10:17 2019/3/26
 * @Modified By:
 * @Version :
 */
public abstract class AbstractCheckChain implements Chain {

    /**
     * 获取处理节点
     *
     * @return
     */
    protected abstract List<CheckNode> initNodes();

    @Override
    public void processChain(Context context) {
        List<CheckNode> curNodes = initNodes();

        for (CheckNode node : curNodes) {

            node.processCheck(context);
        }
    }
}
