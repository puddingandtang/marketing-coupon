package com.tcl.marketing.coupon.common.coupon.type;

import com.tcl.marketing.coupon.common.coupon.rule.CityCouponRule;
import com.tcl.marketing.coupon.common.coupon.rule.TimeBucketCouponRule;
import lombok.Getter;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 17:45 2019/3/25
 * @Modified By:
 * @Version :
 */
@Getter
public enum CouponRuleEnum {

    CITY_RULE(1, "CITY_RULE", "城市使用规则", CityCouponRule.class),

    TIME_BUCKET_RULE(2, "TIME_BUCKET_RULE", "时段使用规则", TimeBucketCouponRule.class);

    private int code;

    private String ruleCode;

    private String ruleDesc;

    private Class aClass;

    CouponRuleEnum(int code, String ruleCode, String ruleDesc, Class aClass) {
        this.code = code;
        this.ruleCode = ruleCode;
        this.ruleDesc = ruleDesc;
        this.aClass = aClass;
    }
}
