package com.tcl.marketing.coupon.common.model.coupon.type;

import lombok.Getter;
import org.springframework.util.CollectionUtils;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 16:29 2019/3/25
 * @Modified By:
 * @Version :
 */
@Getter
public enum CouponKindEnum {

    DEFAULT_COUPON(1, "内部券"),

    DEFAULT_CARD(2, "内部月卡"),

    PARTNER_COUPON(3, "体验券");

    private int code;

    private String desc;

    CouponKindEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }


    public final static Map<Integer, CouponKindEnum> staticMap;

    static {

        staticMap = Arrays.stream(CouponKindEnum.values()).collect(Collectors.toMap(t -> t.getCode(), t -> t, (before, after) -> before));
    }

    /**
     * 查询
     *
     * @param code
     * @return
     */
    public static final CouponKindEnum acquire(Integer code) {

        if (CollectionUtils.isEmpty(staticMap)) {

            return null;
        }

        return staticMap.getOrDefault(code, null);
    }


}
