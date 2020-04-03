package com.tcl.marketing.coupon.common.model.coupon.grant;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 15:24 2019/3/26
 * @Modified By:
 * @Version :
 */
@Data
public class GrantCouponResult implements Serializable {

    /**
     * 优惠劵模板编码
     */
    private Long couponTempId;

    /**
     * 优惠劵数量
     */
    private Integer couponNum;

    /**
     * 该券发放结果编码
     */
    private Integer failCode;

    /**
     * 券编号
     */
    private List<String> couponNos;

    /**
     * 失败原因
     */
    private String failMsg;
}
