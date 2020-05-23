package com.tcl.marketing.coupon.service.biz.user.component.life;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @program: marketing-coupon
 * @description:
 * @author: Mr.Tang
 * @create: 2020-05-23 14:04
 * @version:
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CouponInfo implements Serializable {

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
}
