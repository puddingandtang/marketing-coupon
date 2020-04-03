package com.tcl.marketing.coupon.service.biz.resource.bo;

import com.tcl.marketing.coupon.dal.dataobject.CouponResourceBizDO;
import com.tcl.marketing.coupon.dal.dataobject.CouponResourceDO;
import com.tcl.marketing.coupon.dal.dataobject.CouponResourceRuleDO;
import com.tcl.marketing.coupon.dal.dataobject.CouponResourceTerminalDO;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.stream.Collectors;

public class CouponResourceTransfer {

    public static CouponResourceAssemblyBO combineAssembly(CouponResourceDO resourceDO, List<CouponResourceTerminalDO> terminalDOs, List<CouponResourceBizDO> bizDOs, List<CouponResourceRuleDO> ruleDOs) {

        if (null == resourceDO) {

            return CouponResourceAssemblyBO.builder().resourceNo(-1L).build();
        }

        // todo 转换


        return CouponResourceAssemblyBO.builder().resourceNo(resourceDO.getId()).build();

    }


    public static CouponResourceBO combine(CouponResourceDO couponResourceDO) {

        if (null == couponResourceDO) {

            return null;
        }


        return CouponResourceBO.builder().build();
    }

    public static List<CouponResourceTerminalBO> combineTerminal(List<CouponResourceTerminalDO> terminalDOs) {

        if (CollectionUtils.isEmpty(terminalDOs)) {

            return null;
        }

        return terminalDOs.stream().map(t -> CouponResourceTerminalBO.builder().build()).collect(Collectors.toList());
    }

    public static List<CouponResourceBizBO> combineBiz(List<CouponResourceBizDO> bizDOs) {

        if (CollectionUtils.isEmpty(bizDOs)) {

            return null;
        }

        return bizDOs.stream().map(t -> CouponResourceBizBO.builder().build()).collect(Collectors.toList());
    }

    public static List<CouponResourceRuleBO> combineRule(List<CouponResourceRuleDO> ruleDOs) {

        if (CollectionUtils.isEmpty(ruleDOs)) {

            return null;
        }

        return ruleDOs.stream().map(t -> CouponResourceRuleBO.builder().build()).collect(Collectors.toList());
    }


}
