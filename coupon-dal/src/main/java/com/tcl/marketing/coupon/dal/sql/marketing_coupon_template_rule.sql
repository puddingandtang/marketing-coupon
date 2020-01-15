# 券模板规则
CREATE TABLE `marketing_coupon_template_rule` (
  `id`           BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT
  COMMENT '自增主键',
  `template_id`  BIGINT(20) UNSIGNED NOT NULL
  COMMENT '券模板编号',
  `rule_code`    VARCHAR(256)        NOT NULL DEFAULT ''
  COMMENT '券模板规则编码',
  `rule_content` LONGTEXT            NOT NULL
  COMMENT '券模板规则内容',
  `version`      VARCHAR(128)        NOT NULL DEFAULT '1.0'
  COMMENT '规则版本号',
  `create_time`  TIMESTAMP           NOT NULL DEFAULT CURRENT_TIMESTAMP
  COMMENT '创建时间',
  `update_time`  TIMESTAMP           NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
  COMMENT '更新时间',
  PRIMARY KEY (`id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  COMMENT = '券模板规则表';