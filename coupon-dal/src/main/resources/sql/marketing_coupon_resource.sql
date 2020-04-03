CREATE TABLE `mc_coupon_resource`
(
    `id`              bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '自增主键',
    `name`            varchar(128)        NOT NULL COMMENT '模版名称',
    `scenes`          tinyint(3) unsigned NOT NULL COMMENT '资源模版使用场景',
    `kind`            tinyint(8) unsigned NOT NULL DEFAULT '1' COMMENT '种类：1.内部券，2.内部月卡，3.外部合作券',
    `type`            tinyint(8) unsigned          DEFAULT NULL COMMENT '类型：kind=1(1.面值券，2.折扣券，3.面值体验券)',
    `content`         longtext            NOT NULL COMMENT '资源模版价值规则：JSON字符串',
    `effective_type`  tinyint(2) unsigned NOT NULL DEFAULT '1' COMMENT '有效类型：1.相对有效期，2.绝对有效期',
    `effective_day`   int(10) unsigned             DEFAULT NULL COMMENT '自领取X天有效',
    `effective_begin` timestamp           NULL     DEFAULT NULL COMMENT '有效开始时间',
    `effective_end`   timestamp           NULL     DEFAULT NULL COMMENT '有效结束时间',
    `copy_writer`     longtext COMMENT '文案',
    `status`          tinyint(8) unsigned NOT NULL DEFAULT '1' COMMENT '资源状态：1.初始化，2.已启用，3.已禁用，9.已废弃',
    `create_time`     timestamp           NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time`     timestamp           NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8 COMMENT ='资源模版配置表'