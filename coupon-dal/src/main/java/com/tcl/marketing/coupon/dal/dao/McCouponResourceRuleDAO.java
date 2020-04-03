package com.tcl.marketing.coupon.dal.dao;

import com.tcl.marketing.coupon.dal.dataobject.CouponResourceRuleDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface McCouponResourceRuleDAO {

    List<CouponResourceRuleDO> queryByTemplateNo(@Param("templateNo") Long templateNo);

    int batchInsert(@Param("rules") List<CouponResourceRuleDO> rules);
}
