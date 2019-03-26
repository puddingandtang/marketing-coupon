package com.tcl.marketing.coupon.web.request;

import com.tcl.marketing.coupon.web.model.GrantCoupon;
import com.tcl.marketing.coupon.web.model.GrantOutContent;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 23:49 2019/3/25
 * @Modified By:
 * @Version :
 */
@Data
public class CouponGrantRequest implements Serializable {

    private Long userNo;

    private Integer userType;

    private String outTraceNo;

    private GrantOutContent outContent;

    private Integer grantBizType;

    private Integer grantSource;

    private List<GrantCoupon> coupons;

}
