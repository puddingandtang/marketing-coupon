package com.tcl.marketing.coupon.web;

import com.tcl.marketing.coupon.common.aop.ServiceResultAop;
import com.tcl.marketing.coupon.common.model.RpcResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @program: marketing-coupon
 * @description: 券到期提醒任务
 * @author: Mr.Tang
 * @create: 2020-05-25 09:39
 * @version:
 **/
@Slf4j
@RestController
@RequestMapping("coupon/core/expire")
@CrossOrigin(origins = "*", allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class CouponExpireRemindController {

    @ServiceResultAop
    @PostMapping(value = "/remind")
    public RpcResult<Void> touchRemind(){

        /**
         * 用户优惠券的到期提醒
         *
         * 1.数据级别和用户券差不多，但是不建议将到期提醒的一些业务挂载到用户券，因此构建到期提醒特有的券数据。
         * 2.由于数量级别大，进行分库分表，分库分表原则：到期提醒时间，用户类型
         * 3.深度分页问题，需要减少扫描行数。例如将当前用户提醒分组，每组用户尽量在10w人次左右。然后在每组的分页查询，可以仅仅limit 1000 或者 查询携带上id > 上次处理的最大id
         *
         * 注意：这个到期提醒的push，短信，站内信这些是挂载在券模版下面，还是说统一的提醒文案（仅仅占位符替换）。
         *
         * 到期提醒的规则（需要确定提醒文案的是统一的还是挂载指定模版的）：
         * 例如：用户明天到期的有10张（未使用），那么选择最高价值的进行推送提醒。
         * 例如：用户明天到期的有10张（未使用），那么进行整合，推送一条提醒。
         *
         * 分片并行处理，提高处理能力
         *
         */


        return new RpcResult<>();
    }
}
