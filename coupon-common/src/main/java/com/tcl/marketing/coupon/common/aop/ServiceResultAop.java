package com.tcl.marketing.coupon.common.aop;

import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.annotation.*;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 15:57 2019/3/25
 * @Modified By:
 * @Version :
 */
@Documented
@ResponseBody
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD, ElementType.TYPE })
public @interface ServiceResultAop {
}
