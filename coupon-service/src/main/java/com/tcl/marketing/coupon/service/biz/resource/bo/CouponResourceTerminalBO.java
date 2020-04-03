package com.tcl.marketing.coupon.service.biz.resource.bo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CouponResourceTerminalBO implements Serializable {

    private Long id;

    private Long resourceId;

    private Integer terminal;

}
