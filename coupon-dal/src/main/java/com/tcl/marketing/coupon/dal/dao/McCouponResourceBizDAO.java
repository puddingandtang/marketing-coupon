package com.tcl.marketing.coupon.dal.dao;

import com.tcl.marketing.coupon.dal.dataobject.CouponResourceBizDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface McCouponResourceBizDAO {

    List<CouponResourceBizDO> queryByTemplateNo(@Param("templateNo") Long templateNo);
}
