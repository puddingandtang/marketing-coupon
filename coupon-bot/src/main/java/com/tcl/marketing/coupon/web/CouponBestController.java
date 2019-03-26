package com.tcl.marketing.coupon.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 22:46 2019/3/26
 * @Modified By:
 * @Version :
 */
@Slf4j
@RestController
@RequestMapping("coupon/best")
@CrossOrigin(origins = "*", allowedHeaders = "*", methods = { RequestMethod.GET, RequestMethod.POST })
public class CouponBestController {

    /**
     * 优惠券的推荐：
     * 优惠券的推荐一般和用户的操作特征有关，也和券的规则有关。
     * 一般优惠券的规则：
     *  <p>
     * 0.使用金额
     * 1.城市限定规则
     * 2.使用时段规则
     * 3.使用周规则
     * 4.使用月规则
     * 5.电子围栏规则
     * 6.一些和相关业务的规则，例如出行行业，车型规则，终端规则等
     *
     * 在sql层面去筛选出符合规则的券是不现实的，将压力压在了DB，当然面向用户侧的数据，这种实现也是不靠谱的。
     * 那么通过代码层面过滤筛选，可以解决。但是数据层存在一个不可控因素，那就是用户拥有的券数量，如果将未使用且未过期的数据捞取处理，不加以限制，
     * 很可能导致内存异常。建议limit数据。
     *
     * 通过规则可以筛选出多张券，再通过使用金额，券有效进行推荐规则进行二次过滤
     *
     * 这些是通过硬编码构建的推荐。假设大数据将用户的用券行为特征采集下来，针对用户特征进行推荐，这将更符合用户行为。
     * 将一些规则的过滤封装成一个个小插件（可以通过groovy实现动态构建），然后根据特征，筛选出针对用户的推荐插件，构建出专属个人的推荐逻辑。
     *
     */
}
