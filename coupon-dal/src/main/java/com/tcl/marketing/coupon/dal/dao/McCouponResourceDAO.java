package com.tcl.marketing.coupon.dal.dao;

import com.tcl.marketing.coupon.dal.dataobject.CouponResourceDO;
import org.apache.ibatis.annotations.Param;

public interface McCouponResourceDAO {

    CouponResourceDO queryByTemplateNo(@Param("templateNo") Long templateNo);
}
