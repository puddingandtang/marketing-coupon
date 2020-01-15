package com.tcl.marketing.coupon.service.core.node.input;

import com.tcl.marketing.coupon.service.core.model.Context;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 10:36 2019/3/26
 * @Modified By:
 * @Version :
 */
public interface InputNode<T extends Context> {

    /**
     * 执行输入
     *
     * @param context
     */
    void processInput(T context);
}
