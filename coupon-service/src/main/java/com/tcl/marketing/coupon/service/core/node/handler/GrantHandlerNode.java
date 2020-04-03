package com.tcl.marketing.coupon.service.core.node.handler;

import com.tcl.marketing.coupon.service.core.model.GrantContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 11:02 2019/3/26
 * @Modified By:
 * @Version :
 */
@Slf4j
@Component
public class GrantHandlerNode implements HandlerNode<GrantContext> {

    @Override
    public void processHandler(GrantContext context) {

        // TODO 根据发放的券，预先生成好券编号，可以采用基于zk的雪花算法,这里进行实际库存的校验，通过Redis的原子操作（DB持久化通过定时任务进行同步）
        // TODO 如果接下来的步骤失败需要回滚实际发放库存，避免数据异常

        // TODO 将券数据持久化到 用户券表，发放记录明细表；更新发放记录表状态 一个事务里面

        // TODO 假设上一步失败，则更新发放记录表状态,并抛出异常

    }
}
