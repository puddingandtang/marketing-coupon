package com.tcl.marketing.coupon.service.core.engine;

import com.tcl.marketing.coupon.service.core.chain.Chain;
import com.tcl.marketing.coupon.service.core.model.Context;

import java.util.List;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 10:01 2019/3/26
 * @Modified By:
 * @Version :
 */
public abstract class AbstractEngine implements Engine {

    /**
     * 子类实现，用于构建Chain链路集
     *
     * @return
     */
    protected abstract List<Chain> initChain();

    @Override
    public void processEngine(Context context) {

        List<Chain> curChains = initChain();

        for (Chain chain : curChains) {

            chain.processChain(context);
        }
    }
}
