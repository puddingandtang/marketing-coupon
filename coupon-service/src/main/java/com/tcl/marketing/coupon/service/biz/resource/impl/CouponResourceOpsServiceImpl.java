package com.tcl.marketing.coupon.service.biz.resource.impl;

import com.tcl.marketing.coupon.common.exception.BizException;
import com.tcl.marketing.coupon.common.exception.ErrorCodes;
import com.tcl.marketing.coupon.dal.dataobject.CouponResourceBizDO;
import com.tcl.marketing.coupon.dal.dataobject.CouponResourceDO;
import com.tcl.marketing.coupon.dal.dataobject.CouponResourceRuleDO;
import com.tcl.marketing.coupon.dal.dataobject.CouponResourceTerminalDO;
import com.tcl.marketing.coupon.service.biz.resource.CouponResourceOpsService;
import com.tcl.marketing.coupon.service.biz.resource.CouponResourceQueryService;
import com.tcl.marketing.coupon.service.biz.resource.bo.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Slf4j(topic = "couponResourceOps")
public class CouponResourceOpsServiceImpl implements CouponResourceOpsService {

    @Resource
    CouponResourceQueryService couponResourceQueryService;

    @Override
    public int addIfExistUpdate(CouponResourceBO resourceBO, CouponResourceTerminalBO resourceTerminalBO, CouponResourceBizBO resourceBizBO, CouponResourceRuleBO resourceRuleBO) {

        // todo 这里不进行过度校验，上层保障数据存在合法性

        // todo 添加事务,可重复读,事务操作尽量纯粹,可以抽离一个core层，仅仅处理DDL

        Long opsResourceId = resourceBO.getId();

        CouponResourceDO resourceDO = null;
        CouponResourceBizDO resourceBizDO = null;
        CouponResourceTerminalDO resourceTerinalDO = null;
        CouponResourceRuleDO resourceRuleDO = null;

        int opsResult;

        if (null != opsResourceId) {

            opsResult = add(resourceDO, resourceBizDO, resourceTerinalDO, resourceRuleDO);

            log.info("新增");

        } else {

            // todo 需要注意后期不断新增的规则，需要兼容

            CouponResourceAssemblyBO queryAssemblyBOFormDB = couponResourceQueryService.lookupDetail(opsResourceId);

            if (null == queryAssemblyBOFormDB) {

                throw new BizException(ErrorCodes.DEFAULT_CHECK_DATA_NOT_EXIST);
            }

            // todo resourceTerminalBO，resourceBizBO，resourceRuleBO 比较 queryAssemblyBOFormDB 中的数据，如果不存在的需要新增，存在的更新。
            // todo 或者 queryAssemblyBOFormDB中的数据都进行逻辑删除，然后新增 resourceTerminalBO，resourceBizBO，resourceRuleBO

            opsResult = update(resourceDO, resourceBizDO, resourceTerinalDO, resourceRuleDO);

            log.info("更新");
        }


        return 0;
    }


    private int add(CouponResourceDO resourceDO, CouponResourceBizDO resourceBizDO, CouponResourceTerminalDO resourceTerinalDO, CouponResourceRuleDO resourceRuleDO) {

        return 0;
    }

    private int update(CouponResourceDO resourceDO, CouponResourceBizDO resourceBizDO, CouponResourceTerminalDO resourceTerinalDO, CouponResourceRuleDO resourceRuleDO) {


        return 0;
    }


}
