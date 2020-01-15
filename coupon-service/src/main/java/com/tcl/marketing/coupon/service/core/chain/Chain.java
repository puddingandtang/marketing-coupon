package com.tcl.marketing.coupon.service.core.chain;

import com.tcl.marketing.coupon.service.core.model.Context;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 9:56 2019/3/26
 * @Modified By:
 * @Version :
 */
public interface Chain<T extends Context> {

    /**
     * 执行链路
     *
     * @param context
     */
    void processChain(T context);
}
