package com.tcl.marketing.coupon.web;

import com.tcl.marketing.coupon.common.aop.ServiceResultAop;
import com.tcl.marketing.coupon.common.model.RpcResult;
import com.tcl.marketing.coupon.service.CouponGrantService;
import com.tcl.marketing.coupon.service.core.engine.GrantEngine;
import com.tcl.marketing.coupon.web.request.CouponGrantRequest;
import com.tcl.marketing.coupon.web.response.CouponGrantResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 23:48 2019/3/25
 * @Modified By:
 * @Version :
 */
@Slf4j
@RestController
@RequestMapping("coupon/grant")
@CrossOrigin(origins = "*", allowedHeaders = "*", methods = { RequestMethod.GET, RequestMethod.POST })
public class CouponGrantController {

    @Resource
    GrantEngine grantEngine;

    @ServiceResultAop
    @PostMapping(value = "/one")
    public RpcResult<CouponGrantResponse> oneGrant(@RequestBody CouponGrantRequest request) {

        grantEngine.processEngine();

        return new RpcResult(null);
    }
}
