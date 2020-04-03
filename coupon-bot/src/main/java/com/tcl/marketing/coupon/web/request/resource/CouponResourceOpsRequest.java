package com.tcl.marketing.coupon.web.request.resource;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 券资源操作请求体
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CouponResourceOpsRequest implements Serializable {

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

    private List<Integer> terminals;

    private List<Integer> bizResources;

    private Map<String, String> rules;

}
