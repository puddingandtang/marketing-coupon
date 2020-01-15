package com.tcl.marketing.coupon.web.response;

import com.tcl.marketing.coupon.dal.dataobject.CouponGrantRecordDetail;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 22:06 2019/3/26
 * @Modified By:
 * @Version :
 */
@Data
public class CouponGrantRecordResponse implements Serializable {

    private String outTraceNo;

    /**
     * 处理状态
     */
    private Integer grantStatus;

    private List<CouponGrantRecordDetail> details;
}
