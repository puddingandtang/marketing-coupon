package com.tcl.marketing.coupon.service.core.engine;

import com.tcl.marketing.coupon.service.core.model.Context;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 9:56 2019/3/26
 * @Modified By:
 * @Version :
 */
public interface Engine<T extends Context> {

    /**
     * 执行引擎
     *
     * @param context
     */
    void processEngine(T context);
}
