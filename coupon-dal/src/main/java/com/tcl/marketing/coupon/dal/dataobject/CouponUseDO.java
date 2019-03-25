package com.tcl.marketing.coupon.dal.dataobject;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 21:48 2019/3/25
 * @Modified By:
 * @Version :
 * <p>
 * <p>
 * 券使用明细
 */
@Data
public class CouponUseDO implements Serializable {

    private Long id;

    private Long userNo;

    private Integer userType;

    private Integer useTerminal;

    private Integer useTerminalBiz;

    private String useTerminalBizNo;

    private String couponNo;

    private String outOrderNo;

    private String outContent;

    private Long useMoney;

    private Date useTime;

    private Date createTime;

    private Date updateTime;

}
