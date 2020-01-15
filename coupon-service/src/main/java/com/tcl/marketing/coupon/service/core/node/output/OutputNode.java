package com.tcl.marketing.coupon.service.core.node.output;

import com.tcl.marketing.coupon.service.core.model.Context;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 10:37 2019/3/26
 * @Modified By:
 * @Version :
 */
public interface OutputNode<T extends Context> {

    /**
     * 执行输出
     *
     * @param context
     */
    void processOutput(T context);
}
