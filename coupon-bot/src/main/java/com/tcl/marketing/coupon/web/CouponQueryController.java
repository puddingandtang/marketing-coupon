package com.tcl.marketing.coupon.web;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 15:23 2019/3/25
 * @Modified By:
 * @Version :
 */
@RestController
@RequestMapping("coupon/query")
@CrossOrigin(origins = "*", allowedHeaders = "*", methods = { RequestMethod.GET, RequestMethod.POST })
public class CouponQueryController {

    // TODO 用户券拥有数量

    // TODO 用户卡包列表

    // TODO 用户券推荐

    // TODO 用户券可用

    // TODO 查询用户指定券信息

}
