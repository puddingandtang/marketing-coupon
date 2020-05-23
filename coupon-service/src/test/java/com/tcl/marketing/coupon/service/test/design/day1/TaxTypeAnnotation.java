package com.tcl.marketing.coupon.service.test.design.day1;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface TaxTypeAnnotation {

    TaxType taxType();
}

