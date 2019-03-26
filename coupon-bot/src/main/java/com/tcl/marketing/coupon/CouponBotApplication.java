package com.tcl.marketing.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 13:06 2019/3/25
 * @Modified By:
 * @Version :
 */
@SpringBootApplication(scanBasePackages = {"com.tcl.marketing.coupon"})
public class CouponBotApplication {

    /**
     * 应用启动入口
     *
     * @param args
     */
    public static void main(String[] args) {

        SpringApplication.run(CouponBotApplication.class, args);
        
    }
}
