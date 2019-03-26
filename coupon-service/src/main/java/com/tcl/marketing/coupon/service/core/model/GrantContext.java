package com.tcl.marketing.coupon.service.core.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 14:06 2019/3/26
 * @Modified By:
 * @Version :
 */
@Data
public class GrantContext extends Context implements Serializable {

    private Long userNo;

    private Integer userType;

    // todo 发放成功券

    // todo 发放失败券，同时要记录失败原因

}
