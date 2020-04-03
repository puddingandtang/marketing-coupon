package com.tcl.marketing.coupon.service.core.model;

import com.tcl.marketing.coupon.common.model.coupon.grant.GrantCoupon;
import com.tcl.marketing.coupon.common.model.coupon.grant.GrantCouponResult;
import com.tcl.marketing.coupon.common.model.coupon.grant.GrantOutContent;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

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

    private String outTraceNo;

    private GrantOutContent outContent;

    private Integer grantBizType;

    private Integer grantSource;

    private List<GrantCoupon> coupons;

    private List<GrantCouponResult> couponResults;

}
