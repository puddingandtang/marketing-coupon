CREATE TABLE `marketing_use_coupon_detail` (
  `id`                  BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT
  COMMENT '自增主键',
  `user_no`             BIGINT(20) UNSIGNED NOT NULL
  COMMENT '用户编号',
  `user_type`           TINYINT(3) UNSIGNED NOT NULL DEFAULT '1'
  COMMENT '用户类型：1.顾客',
  `use_terminal`        TINYINT(8) UNSIGNED NOT NULL
  COMMENT '使用终端：2.app，3.pc',
  `use_terminal_biz`    TINYINT(8) UNSIGNED NOT NULL
  COMMENT '使用终端业务：',
  `use_terminal_biz_no` VARCHAR(256)        NOT NULL
  COMMENT '终端业务编号',
  `coupon_no`           VARCHAR(128)        NOT NULL
  COMMENT '券编号',
  `out_order_no`        VARCHAR(128)        NOT NULL
  COMMENT '外部订单号',
  `out_content`         LONGTEXT COMMENT '外部业务透传信息：json格式',
  `use_money`           BIGINT(20) UNSIGNED NOT NULL DEFAULT '0'
  COMMENT '使用金额',
  `use_time`            DATETIME            NOT NULL
  COMMENT '使用时间',
  `create_time`         TIMESTAMP           NOT NULL DEFAULT CURRENT_TIMESTAMP
  COMMENT '创建时间',
  `update_time`         TIMESTAMP           NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
  COMMENT '更新时间',
  PRIMARY KEY (`id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  COMMENT = '券使用明细表';

