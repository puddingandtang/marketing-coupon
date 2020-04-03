package com.tcl.marketing.coupon.service.resource.bo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CouponResourceBO implements Serializable {

    private Long id;

    private String name;

    private Integer scenes;

    private Integer kind;

    private Integer type;

    private String content;

    private Integer effectiveType;

    private Integer effectiveDay;

    private Date effectiveBegin;

    private Date effectiveEnd;

    private String copyWriter;

    private Integer status;
}
