package com.tcl.marketing.coupon.service.test;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import com.tcl.marketing.coupon.common.model.CityInfo;
import com.tcl.marketing.coupon.common.model.coupon.rule.CityCouponRule;
import com.tcl.marketing.coupon.common.model.coupon.type.CouponRuleEnum;
import com.tcl.marketing.coupon.common.type.LimitTypeEnum;
import com.tcl.marketing.coupon.dal.dataobject.CouponResourceRuleDO;
import org.junit.Test;

public class CouponRuleTest {

    @Test
    public void buildCityRule(){
        CityCouponRule cityCouponRule = new CityCouponRule();

        cityCouponRule.setRuleCode(CouponRuleEnum.CITY_RULE.getRuleCode());
        cityCouponRule.setLimitType(LimitTypeEnum.CUR_LIMIT.getCode());
        CityInfo cityInfo1 = new CityInfo("杭州","0571");
        cityCouponRule.setCities(Lists.newArrayList(cityInfo1));

        String ruleTxt = JSON.toJSONString(cityCouponRule);

        CouponResourceRuleDO ruleDO = new CouponResourceRuleDO();
        ruleDO.setTemplateId(1L);
        ruleDO.setRuleCode(CouponRuleEnum.CITY_RULE.getRuleCode());
        ruleDO.setRuleContent(ruleTxt);
        ruleDO.setVersion("1.0");

        System.out.println(JSON.toJSONString(ruleDO));
    }

}
