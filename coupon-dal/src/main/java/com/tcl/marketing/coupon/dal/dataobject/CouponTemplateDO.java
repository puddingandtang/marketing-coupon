package com.tcl.marketing.coupon.dal.dataobject;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 16:19 2019/3/25
 * @Modified By:
 * @Version :
 * <p>
 * <p>
 * 券模板实体
 */
@lombok.Data
public class CouponTemplateDO implements Serializable {

    private Long id;

    private String name;

    private String title;

    private Integer useScenes;

    private Integer useTerminal;

    private Integer useTerminalBiz;

    private String useTerminalBizNo;

    private Integer type;

    private String content;

    private Integer effectiveDay;

    private Date effectiveBegin;

    private Date effectiveEnd;

    private String useInstructions;

    private String limitCopyWriter;

    private String remark;

    private String version;

    private Integer status;

    private Date createTime;

    private Date updateTime;
}
