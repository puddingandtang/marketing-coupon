package com.tcl.marketing.coupon.service.biz.user.component.life;

import com.tcl.marketing.coupon.common.component.SpringContext;
import com.tcl.marketing.coupon.service.biz.user.component.life.order.AbstractCouponLife;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.stereotype.Component;

/**
 * @program: marketing-coupon
 * @description:
 * @author: Mr.Tang
 * @create: 2020-05-23 13:39
 * @version:
 **/
@Slf4j
@Component
public class CouponLifeComponent {

    public static final String LIFE_FREEZE = "freezeCoupon";
    public static final String LIFE_UNFREEZE = "unFreezeCoupon";
    public static final String LIFE_USE = "useCoupon";
    public static final String LIFE_DESTROY = "destroyCoupon";

    public AbstractCouponLife acquireLifeOrder(String lifeName){

        try{

            AbstractCouponLife abstractCouponLife = (AbstractCouponLife) SpringContext.getBeanByName(lifeName);
            return abstractCouponLife;

        }catch (NoSuchBeanDefinitionException noSuchBeanEx){

            log.warn("获取AbstractCouponLife Bean,BeanName = {} , 不存在该Bean，返回null", lifeName);
            return null;

        }catch (Exception e){

            log.error("获取AbstractCouponLife Bean,BeanName = "+lifeName+",异常:",e);
            throw e;
        }



    }







}
