package com.tcl.marketing.coupon.service.biz.grant.component;

import com.google.common.base.Joiner;
import com.tcl.marketing.coupon.common.exception.BizException;
import com.tcl.marketing.coupon.service.core.model.GrantContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 17:11 2019/3/26
 * @Modified By:
 * @Version :
 */
@Slf4j
@Component
public class CouponGrantIdempotent {

    public boolean checkGrantIdempotent(GrantContext grantContext) {

        String outTraceNo = grantContext.getOutTraceNo();
        Integer grantBizType = grantContext.getGrantBizType();
        String key = Joiner.on("_").join(outTraceNo, String.valueOf(grantBizType));

        // todo  key 用redis String setIfAbsent 构建这个值，同时设置失效时间(根据业务评估)，这里需要注意保证2个操作时原子的
        boolean isExistRequest = true;

        if (!isExistRequest) {
            throw new BizException("请勿重复请求");
        }

        // todo 通过outTraceNo，grantBizType 查询发放记录，看看数据是否存在
        // todo 如果记录存在，则抛出异常，异常码为可以定义为发放记录状态
        isExistRequest = true;
        if (!isExistRequest) {
            throw new BizException("请勿重复请求");
        }

        // todo 执行到这里代表这个请求是成立的，构建发放记录

        // todo 插入数据成功,即可移除幂等锁

        return true;
    }
}
