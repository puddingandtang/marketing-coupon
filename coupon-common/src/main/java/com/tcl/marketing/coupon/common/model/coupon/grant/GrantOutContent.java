package com.tcl.marketing.coupon.common.model.coupon.grant;

import lombok.Data;

import java.io.Serializable;
import java.util.Map;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 15:16 2019/3/26
 * @Modified By:
 * @Version :
 */
@Data
public class GrantOutContent implements Serializable {

    /**
     * 设备号
     */
    private String deviceId;

    /**
     * 请求IP
     */
    private String ip;

    /**
     * 城市
     */
    private String cityCode;

    private Map<String, String> other;

}
