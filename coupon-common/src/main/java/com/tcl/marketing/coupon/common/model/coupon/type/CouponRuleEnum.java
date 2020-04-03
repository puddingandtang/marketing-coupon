package com.tcl.marketing.coupon.common.model.coupon.type;

import com.tcl.marketing.coupon.common.model.coupon.rule.CityCouponRule;
import com.tcl.marketing.coupon.common.model.coupon.rule.TimeCouponRule;
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

    TIME_RULE(2, "TIME_RULE", "时间使用规则", TimeCouponRule.class);

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
