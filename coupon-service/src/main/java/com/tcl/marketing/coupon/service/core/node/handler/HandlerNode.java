package com.tcl.marketing.coupon.service.core.node.handler;

import com.tcl.marketing.coupon.service.core.model.Context;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 10:35 2019/3/26
 * @Modified By:
 * @Version :
 */
public interface HandlerNode<T extends Context> {

    /**
     * 执行
     *
     * @param context
     */
    void processHandler(T context);
}
