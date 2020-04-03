package com.tcl.marketing.coupon.dal.dataobject;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;


@Data
public class CouponResourceDO implements Serializable {

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
