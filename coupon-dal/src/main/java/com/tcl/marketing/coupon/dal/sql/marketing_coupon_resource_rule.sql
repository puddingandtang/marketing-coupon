CREATE TABLE `mc_coupon_resource_rule`
(
    `id`          bigint(20) unsigned             NOT NULL AUTO_INCREMENT COMMENT '自增主键，无业务含义',
    `resource_no` bigint(20) unsigned             NOT NULL COMMENT '资源编号：mc_coupon_resource#id',
    `rule_code`   varchar(128) CHARACTER SET utf8 NOT NULL COMMENT '规则编码',
    `rule_value`  longtext                        NOT NULL COMMENT '规则内容',
    `version`     varchar(10) CHARACTER SET utf8  NOT NULL DEFAULT '1.0' COMMENT '规则版本',
    `create_time` timestamp                       NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time` timestamp                       NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`),
    UNIQUE KEY `uk_resource` (`resource_no`, `rule_code`) USING BTREE,
    KEY `idx_create_time` (`create_time`) USING BTREE,
    KEY `idx_update_time` (`update_time`) USING BTREE
) ENGINE = InnoDB
  DEFAULT CHARSET = latin1 COMMENT ='资源模版配置规则表'