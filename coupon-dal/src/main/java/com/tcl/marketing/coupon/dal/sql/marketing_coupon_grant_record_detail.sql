CREATE TABLE `marketing_coupon_grant_record_detail` (
  `id`             BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT
  COMMENT '自增主键',
  `user_no`        BIGINT(20) UNSIGNED NOT NULL
  COMMENT '用户编号',
  `user_type`      TINYINT(3) UNSIGNED NOT NULL DEFAULT '1'
  COMMENT '用户类型：1.顾客',
  `record_no`      VARCHAR(64)         NOT NULL
  COMMENT '记录编号',
  `coupon_temp_no` BIGINT(20) UNSIGNED NOT NULL
  COMMENT '券模板编号',
  `coupon_no`      VARCHAR(64)         NOT NULL
  COMMENT '券编号',
  `grant_source`   TINYINT(8) UNSIGNED NOT NULL DEFAULT '1'
  COMMENT '发放来源：1.活动赠送，2.分享赠送，3商城购买',
  `del_flag`       TINYINT(3) UNSIGNED NOT NULL DEFAULT '1'
  COMMENT '删除标识：1.未删除，2已删除',
  `create_time`    TIMESTAMP           NOT NULL DEFAULT CURRENT_TIMESTAMP
  COMMENT '创建时间',
  `update_time`    TIMESTAMP           NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
  COMMENT '更新时间',
  PRIMARY KEY (`id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  COMMENT = '券发放记录明细表';

