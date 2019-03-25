package com.tcl.marketing.coupon.web;

import com.tcl.marketing.coupon.common.aop.ServiceResultAop;
import com.tcl.marketing.coupon.common.model.RpcResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 13:07 2019/3/25
 * @Modified By:
 * @Version :
 */
@Slf4j
@RestController
@RequestMapping("base")
@CrossOrigin(origins = "*", allowedHeaders = "*", methods = { RequestMethod.GET, RequestMethod.POST })
public class BaseController {

    @ServiceResultAop
    @GetMapping(value = "/checkService")
    public RpcResult<String> checkService() {

        log.info("服务检查接口");
        return new RpcResult("check Service is success");
    }
}
