package com.tcl.marketing.coupon.common.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import com.tcl.marketing.coupon.common.model.CityInfo;
import com.tcl.marketing.coupon.common.model.coupon.FaceCoupon;
import com.tcl.marketing.coupon.common.model.coupon.rule.CityCouponRule;
import com.tcl.marketing.coupon.common.model.coupon.type.CouponKindEnum;
import com.tcl.marketing.coupon.common.model.coupon.type.CouponRuleEnum;
import com.tcl.marketing.coupon.common.model.coupon.type.CouponTypeEnum;
import com.tcl.marketing.coupon.common.type.LimitTypeEnum;
import org.junit.Test;

public class CouponEntryTest {

    @Test
    public void buildFaceCoupon() {

        FaceCoupon faceCoupon = new FaceCoupon();
        faceCoupon.setKind(CouponKindEnum.DEFAULT_COUPON.getCode());
        faceCoupon.setType(CouponTypeEnum.FACE.getCode());
        faceCoupon.setMinMoney(0L);
        faceCoupon.setMaxMoney(10_000L);
        faceCoupon.setMoney(5_00L);
        faceCoupon.setCouponTitleOne("{amount}元");
        faceCoupon.setCouponTitleTwo("满{minMoney}元可用");

        System.out.println(JSON.toJSONString(faceCoupon));
    }

}
