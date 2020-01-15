package com.tcl.marketing.coupon.common.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 17:48 2019/3/25
 * @Modified By:
 * @Version :
 */
@Data
public class TimeBucket implements Serializable {

    private String begin;

    private String end;
}
