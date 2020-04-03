package com.tcl.marketing.coupon.web.request;

import com.tcl.marketing.coupon.common.model.coupon.grant.GrantCoupon;
import com.tcl.marketing.coupon.common.model.coupon.grant.GrantOutContent;
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

    /**
     * true:券自身有库存，有什么发什么，没有库存的就不发
     * false：只要一个没有库存，就不发
     */
    private Boolean canGrant;

    private List<GrantCoupon> coupons;

}
