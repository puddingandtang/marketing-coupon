package com.tcl.marketing.coupon.service.biz.resource.component;

import com.alibaba.fastjson.JSON;
import com.google.common.base.Strings;
import com.tcl.marketing.coupon.common.component.cache.AbstractLocalCache;
import com.tcl.marketing.coupon.dal.dao.McCouponResourceBizDAO;
import com.tcl.marketing.coupon.dal.dao.McCouponResourceDAO;
import com.tcl.marketing.coupon.dal.dao.McCouponResourceRuleDAO;
import com.tcl.marketing.coupon.dal.dao.McCouponResourceTerminalDAO;
import com.tcl.marketing.coupon.dal.dataobject.CouponResourceBizDO;
import com.tcl.marketing.coupon.dal.dataobject.CouponResourceDO;
import com.tcl.marketing.coupon.dal.dataobject.CouponResourceRuleDO;
import com.tcl.marketing.coupon.dal.dataobject.CouponResourceTerminalDO;
import com.tcl.marketing.coupon.service.biz.resource.bo.CouponResourceAssemblyBO;
import com.tcl.marketing.coupon.service.biz.resource.bo.CouponResourceTransfer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * 券模版资源缓存
 */
@Slf4j
@Component
public class CouponResourceCache extends AbstractLocalCache<Long, CouponResourceAssemblyBO> {

    @Resource
    McCouponResourceDAO mcCouponResourceDAO;

    @Resource
    McCouponResourceTerminalDAO mcCouponResourceTerminalDAO;

    @Resource
    McCouponResourceBizDAO mcCouponResourceBizDAO;

    @Resource
    McCouponResourceRuleDAO mcCouponResourceRuleDAO;

    public CouponResourceCache() {

        super(10_000, 1 * 60 * 60);
    }

    /**
     * @param key    缓存键：券模版编号
     * @param params 获取value的参数数组(可使用key获取)
     * @return
     */
    @Override
    protected CouponResourceAssemblyBO loadValue(Long key, Object... params) {


        // todo 这里可以借助redis来存储到内存中，如果引入redis，则需要先从redis中获取，我这里采用的是String结构
        // todo ttl 这里设置建议大于super(10_000, 1 * 60 * 60)中的1 * 60 * 60，本地缓存失效后，查内存数据库数据，再查Mysql

        String queryRedisValue = "";
        if (!Strings.isNullOrEmpty(queryRedisValue)) {

            try {

                return JSON.parseObject(queryRedisValue, CouponResourceAssemblyBO.class);

            } catch (Exception e) {

                log.error("查询券[" + key + "]资源信息-Redis-转化异常,默认再去查询DB:", e);
            }
        }

        // 查询DB
        CouponResourceDO couponResourceDO = mcCouponResourceDAO.queryByTemplateNo(key);

        List<CouponResourceTerminalDO> terminalDOs = null;

        List<CouponResourceBizDO> bizDOs = null;

        List<CouponResourceRuleDO> ruleDOs = null;

        if (null != couponResourceDO) {

            terminalDOs = mcCouponResourceTerminalDAO.queryByTemplateNo(key);

            bizDOs = mcCouponResourceBizDAO.queryByTemplateNo(key);

            ruleDOs = mcCouponResourceRuleDAO.queryByTemplateNo(key);
        }

        CouponResourceAssemblyBO couponResourceAssemblyBO = CouponResourceTransfer.combineAssembly(couponResourceDO, terminalDOs, bizDOs, ruleDOs);

        queryRedisValue = JSON.toJSONString(couponResourceAssemblyBO);

        // todo 构建到Redis，并设置TTL

        return couponResourceAssemblyBO;
    }
}
