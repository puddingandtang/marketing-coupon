package com.tcl.marketing.coupon.common.component.cache;

public class LocalCacheException extends RuntimeException{

    private static final long serialVersionUID = -6361406373564038557L;

    public LocalCacheException() {
        super();
    }

    public LocalCacheException(String message) {
        super(message);
    }

    public LocalCacheException(String message, Throwable cause) {
        super(message, cause);
    }

    public LocalCacheException(Throwable cause) {
        super(cause);
    }
}

