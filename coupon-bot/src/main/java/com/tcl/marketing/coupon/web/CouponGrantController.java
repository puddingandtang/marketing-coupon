package com.tcl.marketing.coupon.web;

import com.tcl.marketing.coupon.common.aop.ServiceResultAop;
import com.tcl.marketing.coupon.common.model.GrantCouponResult;
import com.tcl.marketing.coupon.common.model.RpcResult;
import com.tcl.marketing.coupon.service.core.engine.Engine;
import com.tcl.marketing.coupon.service.core.model.GrantContext;
import com.tcl.marketing.coupon.web.request.CouponGrantRecordRequest;
import com.tcl.marketing.coupon.web.request.CouponGrantRequest;
import com.tcl.marketing.coupon.web.response.CouponGrantRecordResponse;
import com.tcl.marketing.coupon.web.response.CouponGrantResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

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
     * 4.库存不足该如何处理，是有什么发什么，还是说全部都不发
     * 5.接口调用超时，需要提供一个结果查询接口（不建议在oneGrant接口中处理这个操作，职能简单点）
     * <p>
     * 当然优惠券一定有批量发放的接口，需要注意的内存，线程等资源的消耗。
     * <p>
     * 涉及表：
     * marketing_coupon_grant_record ：发放记录
     * marketing_coupon_grant_record_detail：发放记录详情
     * marketing_coupon_template：券模板
     * marketing_user_coupon_package：用户券包
     */

    @Resource
    Engine<GrantContext> grantEngine;

    @ServiceResultAop
    @PostMapping(value = "/one")
    public RpcResult<CouponGrantResponse> oneGrant(@RequestBody CouponGrantRequest request) {

        GrantContext grantContext = new GrantContext();
        grantContext.setUserNo(request.getUserNo());
        grantContext.setUserType(request.getUserType());
        grantContext.setOutTraceNo(request.getOutTraceNo());
        grantContext.setOutContent(request.getOutContent());
        grantContext.setGrantBizType(request.getGrantBizType());
        grantContext.setGrantSource(request.getGrantSource());
        grantContext.setCoupons(request.getCoupons());

        // 通过中断停止引擎执行，其实也可以构建一个中断信号来执行
        grantEngine.processEngine(grantContext);

        CouponGrantResponse response = new CouponGrantResponse();
        response.setUserNo(request.getUserNo());
        response.setUserType(request.getUserType());
        response.setCoupons(grantContext.getCouponResults());

        return new RpcResult(response);
    }

    @ServiceResultAop
    @PostMapping(value = "/queryResult")
    public RpcResult<CouponGrantRecordResponse> queryResult(@RequestBody CouponGrantRecordRequest request) {

        // 这个为了发放提供的一个查询能力，因为系统之间存在网络抖动的原因，通过这个接口告知发放的最终结果
        // TODO 通过outTraceNo，grantBizType查询marketing_coupon_grant_record ，marketing_coupon_grant_record_detail

        return new RpcResult(null);
    }

}
