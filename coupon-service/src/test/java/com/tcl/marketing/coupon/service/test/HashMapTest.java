package com.tcl.marketing.coupon.service.test;

import com.google.common.collect.Maps;
import org.junit.Test;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapTest {

    @Test
    public void hashMapKey(){


        HashMap<String,String> hashMap = Maps.newHashMap();

        hashMap.put("A","A");
        hashMap.put("Q","Q");
        hashMap.put("Q1","Q1");
        hashMap.put("Q2","Q2");
        hashMap.put("Q3","Q3");

        ConcurrentHashMap<String,String> concurrentHashMap = new ConcurrentHashMap();

        concurrentHashMap.put("A","A");
        concurrentHashMap.put("Q","Q");
    }

}
