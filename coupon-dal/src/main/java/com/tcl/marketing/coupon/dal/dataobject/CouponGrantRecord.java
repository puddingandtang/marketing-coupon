package com.tcl.marketing.coupon.dal.dataobject;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 23:27 2019/3/25
 * @Modified By:
 * @Version :
 * <p>
 * <p>
 * 券发放记录
 */
@Data
public class CouponGrantRecord implements Serializable {

    private Long id;

    private Long userNo;

    private Integer userType;

    private String outTraceNo;

    private String outContent;

    private Integer grantBizType;

    private Integer grantSource;

    private Date grantTime;

    private Integer grantStatus;

    private Date createTime;

    private Date updateTime;
}
