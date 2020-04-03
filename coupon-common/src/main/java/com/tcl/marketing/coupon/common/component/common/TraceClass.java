package com.tcl.marketing.coupon.common.component.common;

import org.slf4j.MDC;

import java.util.concurrent.ThreadLocalRandom;

public class TraceClass {

    String MDC_TRADE_ID = "INNER_TRACE_ID";

    /**
     * 设置日志链路
     */
    public void consumerTrace() {

        String traceId = MDC.get("INNER_TRACE_ID");
        if (null == traceId) {
            traceId = buildTrace();
        }

        MDC.put(MDC_TRADE_ID, traceId);
    }

    /**
     * 移除mdc中的trace id
     */
    public void afterTrace() {
        MDC.remove(MDC_TRADE_ID);
    }

    /**
     * 构建traceID
     *
     * @return
     */
    public String buildTrace() {

        long currentTime = System.currentTimeMillis();
        long timeStamp = currentTime % 1000000L;
        int randomNumber = ThreadLocalRandom.current().nextInt(1000000);
        long traceID = timeStamp * 10000 + randomNumber;
        return Long.toHexString(traceID).toUpperCase();
    }
}
