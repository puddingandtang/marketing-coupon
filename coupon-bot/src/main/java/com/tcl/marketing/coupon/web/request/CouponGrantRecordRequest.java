package com.tcl.marketing.coupon.web.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 22:05 2019/3/26
 * @Modified By:
 * @Version :
 */
@Data
public class CouponGrantRecordRequest implements Serializable {

    private String outTraceNo;

    private Integer grantBizType;

}
