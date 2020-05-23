package com.tcl.marketing.coupon.web;

import com.tcl.marketing.coupon.common.aop.ServiceResultAop;
import com.tcl.marketing.coupon.common.exception.ErrorCodes;
import com.tcl.marketing.coupon.common.exception.PreconditionUtil;
import com.tcl.marketing.coupon.common.model.RpcResult;
import com.tcl.marketing.coupon.service.biz.user.component.life.CouponLifeResult;
import com.tcl.marketing.coupon.service.biz.user.component.life.order.AbstractCouponLife;
import com.tcl.marketing.coupon.service.biz.user.component.life.CouponLifeComponent;
import com.tcl.marketing.coupon.service.biz.user.component.life.CouponLifeContext;
import com.tcl.marketing.coupon.web.request.life.CouponLifeRequest;
import com.tcl.marketing.coupon.web.response.life.CouponLifeResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @program: marketing-coupon
 * @description: 券生命周期
 * @author: Mr.Tang
 * @create: 2020-05-23 13:07
 * @version:
 **/
@Slf4j
@RestController
@RequestMapping("coupon/core/life")
@CrossOrigin(origins = "*", allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class CouponLifeController {

    @Resource
    CouponLifeComponent couponLifeComponent;

    /**
     * 冻结优惠券
     *
     * @return
     */
    @ServiceResultAop
    @PostMapping(value = "/freeze")
    public RpcResult<CouponLifeResponse> freezeCoupon(@RequestBody CouponLifeRequest request) {

        commonCheck(request);

        AbstractCouponLife abstractCouponLife = couponLifeComponent.acquireLifeOrder(CouponLifeComponent.LIFE_FREEZE);

        CouponLifeContext context = CouponLifeContext.builder()
                .userNo(request.getUserNo())
                .userType(request.getUserType())
                .couponNo(request.getCouponNo()).build();

        CouponLifeResult result = abstractCouponLife.process(context);

        return commonBuildResult(result);
    }

    /**
     * 解冻优惠券
     *
     * @return
     */
    @ServiceResultAop
    @PostMapping(value = "/unFreeze")
    public RpcResult<CouponLifeResponse> unFreezeCoupon(@RequestBody CouponLifeRequest request) {

        commonCheck(request);

        AbstractCouponLife abstractCouponLife = couponLifeComponent.acquireLifeOrder(CouponLifeComponent.LIFE_UNFREEZE);

        CouponLifeContext context = CouponLifeContext.builder()
                .userNo(request.getUserNo())
                .userType(request.getUserType())
                .couponNo(request.getCouponNo()).build();

        CouponLifeResult result = abstractCouponLife.process(context);

        return commonBuildResult(result);
    }

    /**
     * 使用优惠券
     *
     * @return
     */
    @ServiceResultAop
    @PostMapping(value = "/useCoupon")
    public RpcResult<CouponLifeResponse> useCoupon(@RequestBody CouponLifeRequest request) {

        commonCheck(request);

        AbstractCouponLife abstractCouponLife = couponLifeComponent.acquireLifeOrder(CouponLifeComponent.LIFE_USE);

        CouponLifeContext context = CouponLifeContext.builder()
                .userNo(request.getUserNo())
                .userType(request.getUserType())
                .couponNo(request.getCouponNo()).build();

        CouponLifeResult result = abstractCouponLife.process(context);

        return commonBuildResult(result);
    }

    /**
     * 回收优惠券
     *
     * @return
     */
    @ServiceResultAop
    @PostMapping(value = "/destroyCoupon")
    public RpcResult<CouponLifeResponse> destroyCoupon(@RequestBody CouponLifeRequest request) {

        commonCheck(request);

        AbstractCouponLife abstractCouponLife = couponLifeComponent.acquireLifeOrder(CouponLifeComponent.LIFE_DESTROY);

        CouponLifeContext context = CouponLifeContext.builder()
                .userNo(request.getUserNo())
                .userType(request.getUserType())
                .couponNo(request.getCouponNo()).build();

        CouponLifeResult result = abstractCouponLife.process(context);

        return commonBuildResult(result);
    }

    /**
     * 基础校验
     *
     * @param request
     */
    private void commonCheck(CouponLifeRequest request) {

        PreconditionUtil.checkArgument(null != request, ErrorCodes.LIFE_COUPON_BASE_ERROR, "请求体非法");

        Integer bizCode = request.getBizCode();
        PreconditionUtil.checkArgument(null != bizCode, ErrorCodes.LIFE_COUPON_BASE_ERROR, "请求系统非法");

        Long userNo = request.getUserNo();
        PreconditionUtil.checkArgument(null != userNo && userNo > 0L, ErrorCodes.LIFE_COUPON_BASE_ERROR, "请求用户非法");

        Integer userType = request.getUserType();
        PreconditionUtil.checkArgument(null != userType, ErrorCodes.LIFE_COUPON_BASE_ERROR, "请求用户类型非法");

        Long couponNo = request.getCouponNo();
        PreconditionUtil.checkArgument(null != couponNo && couponNo > 0L, ErrorCodes.LIFE_COUPON_BASE_ERROR, "请求券编号非法");


    }

    /**
     * 返回结果构建
     *
     * @param result
     * @return
     */
    private RpcResult commonBuildResult(CouponLifeResult result) {

        RpcResult rpcResult = null;

        if (null != result && result.isSuccess()) {

            CouponLifeResponse response = CouponLifeResponse.builder().userNo(result.getUserNo()).userType(result.getUserType()).couponNo(result.getCouponNo()).build();

            rpcResult = new RpcResult().success(response);
        } else {

            rpcResult = new RpcResult().failure(result.getCode(), result.getMsg());
        }

        return rpcResult;
    }


}
