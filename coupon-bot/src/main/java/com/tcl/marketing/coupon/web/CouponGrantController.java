package com.tcl.marketing.coupon.web;

import com.tcl.marketing.coupon.common.aop.ServiceResultAop;
import com.tcl.marketing.coupon.common.model.RpcResult;
import com.tcl.marketing.coupon.service.core.engine.Engine;
import com.tcl.marketing.coupon.service.core.model.CouponQueryContext;
import com.tcl.marketing.coupon.service.core.model.GrantContext;
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

    /**
     * 券发放逻辑：
     * <p>
     * 业务扩展点：
     * 1.如何防止被薅羊毛，券的发放可以做一层最后防线。即接入大数据风控，来确认发券的合法性。
     * 2.如何监控券的发放监控大盘。通过埋点日志，构建指定的日志，由Grafan做数据监控。
     * 3.随着数据的增长，表需要根据用户_用户类型分库分表，管理域可以通过TIDB进行数据整合。
     * 4.优惠券到期提醒，通过发放计算出券的到期时间，存放到到期提醒表。
     * <p>
     * 实现注意点：
     * 1.发放数量须将进行限制
     * 2.发放券的数据构建查询券模板信息需要缓存
     * 3.请求需要保证幂等
     * <p>
     * 涉及表：
     * marketing_coupon_grant_record ：发放记录
     * marketing_coupon_grant_record_detail：发放记录详情
     * marketing_coupon_template：券模板
     * marketing_user_coupon_package：用户券包
     */

    @Resource
    Engine<GrantContext> grantEngine;

    @Resource
    Engine<CouponQueryContext> bestCouponEngine;

    @ServiceResultAop
    @PostMapping(value = "/one")
    public RpcResult<CouponGrantResponse> oneGrant(@RequestBody CouponGrantRequest request) {

        grantEngine.processEngine(new GrantContext());

        return new RpcResult(null);
    }
}
