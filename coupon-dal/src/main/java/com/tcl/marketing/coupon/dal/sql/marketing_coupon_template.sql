#券模板信息表
CREATE TABLE `marketing_coupon_template` (
  `id`                  BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT
  COMMENT '自增主键',
  `name`                VARCHAR(256)        NOT NULL DEFAULT ''
  COMMENT '券模板名称',
  `title`               VARCHAR(256)        NOT NULL DEFAULT ''
  COMMENT '模板标题',
  `use_scenes`          TINYINT(8) UNSIGNED NOT NULL DEFAULT '1'
  COMMENT '使用场景：1.活动，2.商城，3.会员，4.客服',
  `use_terminal`        TINYINT(8) UNSIGNED NOT NULL DEFAULT '1'
  COMMENT '使用终端：1.通用，2.app，3.pc',
  `use_terminal_biz`    TINYINT(8) UNSIGNED NOT NULL DEFAULT '1'
  COMMENT '使用终端业务：1.通用，2.商户专属',
  `use_terminal_biz_no` VARCHAR(256)                 DEFAULT NULL
  COMMENT '终端业务编号',
  `type`                TINYINT(6) UNSIGNED NOT NULL DEFAULT '1'
  COMMENT '券模板类型：1：折扣券，2：面值券，3：面值体验卷',
  `content`             VARCHAR(1024)       NOT NULL
  COMMENT '券上下文：用户存储券的面值，折扣等信息',
  `effective_day`       INT(10) UNSIGNED    NOT NULL DEFAULT '0'
  COMMENT '优惠券自领取X天模式',
  `effective_begin`     TIMESTAMP           NULL     DEFAULT NULL
  COMMENT '优惠劵有效期-开始',
  `effective_end`       TIMESTAMP           NULL     DEFAULT NULL
  COMMENT '优惠劵有效期-结束',
  `use_instructions`    VARCHAR(1024)       NOT NULL DEFAULT ''
  COMMENT '使用说明',
  `limit_copy_writer`   VARCHAR(512)                 DEFAULT ''
  COMMENT '限制文案',
  `remark`              VARCHAR(1024)                DEFAULT ''
  COMMENT '备注',
  `version`             VARCHAR(10)         NOT NULL DEFAULT '1.0'
  COMMENT '版本',
  `status`              TINYINT(6) UNSIGNED          DEFAULT NULL
  COMMENT '模板状态：1.待审核，2.审核成功，3.启用，4.禁用',
  `create_time`         TIMESTAMP           NOT NULL DEFAULT CURRENT_TIMESTAMP
  COMMENT '创建时间',
  `update_time`         TIMESTAMP           NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
  COMMENT '更新时间',
  PRIMARY KEY (`id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  COMMENT = '券模板信息';

