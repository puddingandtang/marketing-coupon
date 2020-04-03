package com.tcl.marketing.coupon.web.response.resource;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CouponResourceOpsResponse implements Serializable {

    private Long id;

}
