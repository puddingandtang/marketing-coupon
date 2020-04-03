package com.tcl.marketing.coupon.web.response;

import com.tcl.marketing.coupon.common.model.coupon.grant.GrantCouponResult;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 23:55 2019/3/25
 * @Modified By:
 * @Version :
 */
@Data
public class CouponGrantResponse implements Serializable {

    private Long userNo;

    private Integer userType;

    private List<GrantCouponResult> coupons;
}
