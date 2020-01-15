package com.tcl.marketing.coupon.service.core.model;

import com.google.common.collect.Maps;
import lombok.Data;

import java.io.Serializable;
import java.util.Map;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 14:04 2019/3/26
 * @Modified By:
 * @Version :
 */
@Data
public class Context implements Serializable {

    /**
     * 链路全局参数，上下文传递
     */
    private Map<String, Object> globalInfo = Maps.newHashMap();

}
