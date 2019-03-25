package com.tcl.marketing.coupon.web;

import org.springframework.web.bind.annotation.*;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 13:07 2019/3/25
 * @Modified By:
 * @Version :
 */
@RestController
@RequestMapping("base")
@CrossOrigin(origins = "*", allowedHeaders = "*", methods = { RequestMethod.GET, RequestMethod.POST })
public class BaseController {

    @GetMapping(value = "/checkService")
    public String checkService() {

        return "check Service is success";
    }
}
