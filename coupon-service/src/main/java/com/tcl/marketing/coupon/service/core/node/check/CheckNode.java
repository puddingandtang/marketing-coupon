package com.tcl.marketing.coupon.service.core.node.check;

import com.tcl.marketing.coupon.service.core.model.Context;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 10:35 2019/3/26
 * @Modified By:
 * @Version :
 */
public interface CheckNode<T extends Context> {

    /**
     * 执行校验
     *
     * @param context
     */
    void processCheck(T context);
}
