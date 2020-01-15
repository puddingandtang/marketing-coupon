CREATE TABLE `marketing_user_coupon_package` (
  `id`             BIGINT(20) UNSIGNED  NOT NULL AUTO_INCREMENT
  COMMENT '自增主键',
  `user_no`        BIGINT(20) UNSIGNED  NOT NULL
  COMMENT '用户编号',
  `user_type`      TINYINT(3) UNSIGNED  NOT NULL DEFAULT '1'
  COMMENT '用户类型：1.顾客',
  `coupon_no`      VARCHAR(128)         NOT NULL
  COMMENT '券编号',
  `coupon_temp_id` BIGINT(20) UNSIGNED  NOT NULL
  COMMENT '券模板编号',
  `begin_time`     TIMESTAMP            NOT NULL DEFAULT CURRENT_TIMESTAMP
  COMMENT '券有效时间',
  `end_time`       TIMESTAMP            NOT NULL DEFAULT CURRENT_TIMESTAMP
  COMMENT '券失效时间',
  `use_status`     TINYINT(3) UNSIGNED  NOT NULL DEFAULT '1'
  COMMENT '使用状态：1.未使用，2.冻结，3.已使用',
  `disabled_value` TINYINT(10) UNSIGNED NOT NULL DEFAULT '0'
  COMMENT '失效值：0.该字段无效，1.逻辑删除失效，2.赠送失效',
  `create_time`    TIMESTAMP            NOT NULL DEFAULT CURRENT_TIMESTAMP
  COMMENT '创建时间',
  `update_time`    TIMESTAMP            NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
  COMMENT '更新时间',
  PRIMARY KEY (`id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  COMMENT = '用户券包';

