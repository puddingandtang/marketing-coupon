package com.tcl.marketing.coupon.web;

import com.tcl.marketing.coupon.common.aop.ServiceResultAop;
import com.tcl.marketing.coupon.common.model.RpcResult;
import com.tcl.marketing.coupon.web.request.resource.CouponResourceOpsRequest;
import com.tcl.marketing.coupon.web.response.resource.CouponResourceOpsResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("coupon/manager/resource")
@CrossOrigin(origins = "*", allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class CouponResourceController {


    @ServiceResultAop
    @PostMapping(value = "/add")
    public RpcResult<CouponResourceOpsResponse> add(@RequestBody CouponResourceOpsRequest add) {












        return new RpcResult(null);
    }
}
