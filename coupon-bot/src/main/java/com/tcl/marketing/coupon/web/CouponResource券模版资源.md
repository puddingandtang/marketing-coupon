**券模版资源分类**

表结构：coupon-dal模块下的sql.resource

券模版模型设计：非结构化数据 + 结构化数据

非结构化数据：券价值模型、券规则模型

~~~~
非结构化-券价值模型：

com.tcl.marketing.coupon.common.model.coupon.BaseCoupon
    折扣券：com.tcl.marketing.coupon.common.model.coupon.DiscountCoupon
    面值券：com.tcl.marketing.coupon.common.model.coupon.FaceCoupon
    面值体验券：com.tcl.marketing.coupon.common.model.coupon.ExperienceCoupon

底层存储存储JSON字符串
~~~~

~~~~
非结构化-券规则模型：

com.tcl.marketing.coupon.common.model.coupon.rule.BaseRule
    城市规则：com.tcl.marketing.coupon.common.model.coupon.rule.CityCouponRule
    时间规则：com.tcl.marketing.coupon.common.model.coupon.rule.TimeCouponRule
    区域规则：com.tcl.marketing.coupon.common.model.coupon.rule.AreaCouponRule
    ....
    
底层存储存储JSON字符串
~~~~

~~~~
结构化数据-券基本信息
 券有效期
 券类型
 券终端
 .......
~~~~

采用非结构化数据，可以快速支持后续新增的一些需求。例如新增规则，新增券价值模型。
当然非结构化数据在检索层面比较麻烦，可能导致一些业务查询需要将非结构化数据拆分成结构化数据去支持。


