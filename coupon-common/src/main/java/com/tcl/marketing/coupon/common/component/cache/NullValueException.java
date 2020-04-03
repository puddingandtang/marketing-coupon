package com.tcl.marketing.coupon.common.component.cache;

public class NullValueException extends LocalCacheException {

    private static final long serialVersionUID = 2744507734870036592L;

    public NullValueException() {
        super();
    }

    public NullValueException(String message) {
        super(message);
    }

    public NullValueException(String message, Throwable cause) {
        super(message, cause);
    }

    public NullValueException(Throwable cause) {
        super(cause);
    }
}
