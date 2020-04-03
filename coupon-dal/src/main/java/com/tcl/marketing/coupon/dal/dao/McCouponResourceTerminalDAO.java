package com.tcl.marketing.coupon.dal.dao;

import com.tcl.marketing.coupon.dal.dataobject.CouponResourceTerminalDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface McCouponResourceTerminalDAO {

    List<CouponResourceTerminalDO> queryByTemplateNo(@Param("templateNo") Long templateNo);

}
