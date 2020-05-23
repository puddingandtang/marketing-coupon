package com.tcl.marketing.coupon.service.biz.user.component.life;

import com.tcl.marketing.coupon.common.exception.ErrorCode;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @program: marketing-coupon
 * @description:
 * @author: Mr.Tang
 * @create: 2020-05-23 14:07
 * @version:
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CouponLifeResult implements Serializable {

    public static final int SUCCESS = 200;

    /**
     * 返回码
     */
    private Integer code;

    /**
     * 错误信息
     */
    private String msg;

    /**
     * 中断标示，用于执行流程中需要中断流程的标志
     */
    private Boolean interrupt = false;

    /**
     * 用户编号
     */
    private Long userNo;

    /**
     * 用户类型
     */
    private Integer userType;

    /**
     * 券编号
     */
    private Long couponNo;

    /**
     * 获取中断标示，如果不存在，则返回入参值
     * @param defaultInterrupt
     * @return
     */
    public boolean getInterruptNullDefault(boolean defaultInterrupt) {

        if(null == interrupt){

            return defaultInterrupt;
        }
        return interrupt;
    }

    /**
     * 判断是否处理成功
     * @return
     */
    public boolean isSuccess(){

        if(null != this.code && this.code.intValue() == SUCCESS){
            return true;
        }

        return false;
    }
}
