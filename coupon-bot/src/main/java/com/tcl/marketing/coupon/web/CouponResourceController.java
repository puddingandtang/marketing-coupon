package com.tcl.marketing.coupon.web;

import com.google.common.collect.Lists;
import com.tcl.marketing.coupon.common.aop.ServiceResultAop;
import com.tcl.marketing.coupon.common.model.RpcResult;
import com.tcl.marketing.coupon.dal.dao.McCouponResourceRuleDAO;
import com.tcl.marketing.coupon.dal.dataobject.CouponResourceRuleDO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Slf4j
@RestController
@RequestMapping("coupon/manager/resource")
@CrossOrigin(origins = "*", allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class CouponResourceController {

    @Resource
    McCouponResourceRuleDAO mcCouponResourceRuleDAO;

    @ServiceResultAop
    @PostMapping(value = "/test/addRules")
    public RpcResult<Integer> queryDetail(@RequestBody CouponResourceRuleDO couponResourceRuleDO) {

        int addTotal = mcCouponResourceRuleDAO.batchInsert(Lists.newArrayList(couponResourceRuleDO));

        return new RpcResult(addTotal);
    }











}
