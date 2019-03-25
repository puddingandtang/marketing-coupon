package com.tcl.marketing.coupon.dal.dataobject;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 21:14 2019/3/25
 * @Modified By:
 * @Version :
 * <p>
 * <p>
 * 用户券数据
 */
@Data
public class UserCouponDO implements Serializable {

    private Long id;

    private Long userNo;

    private Integer userType;

    private String couponNo;

    private Long couponTempId;

    private Date beginTime;

    private Date endTime;

    private Integer useStatus;

    private Integer disabledValue;

    private Date createTime;

    private Date updateTime;
}
