# 券发放记录
CREATE TABLE `marketing_coupon_grant_record` (
  `id`             BIGINT(20) UNSIGNED  NOT NULL AUTO_INCREMENT
  COMMENT '自增主键',
  `user_no`        BIGINT(20) UNSIGNED  NOT NULL
  COMMENT '用户编号',
  `user_type`      TINYINT(3) UNSIGNED  NOT NULL DEFAULT '1'
  COMMENT '用户类型：1.顾客',
  `record_no`      VARCHAR(64)          NOT NULL
  COMMENT '记录编号',
  `out_trace_no`   VARCHAR(64)
                   CHARACTER SET latin1 NOT NULL
  COMMENT '外部编号：请求标识',
  `out_content`    LONGTEXT COMMENT '外部业务请求数据',
  `grant_biz_type` TINYINT(8) UNSIGNED  NOT NULL DEFAULT '1'
  COMMENT '发放业务：1.营销系统，2.客服补偿，3.营销配置域，4.cop，5.商城',
  `grant_source`   TINYINT(8) UNSIGNED  NOT NULL DEFAULT '1'
  COMMENT '发放来源：1.活动赠送，2.分享赠送，3商城购买',
  `grant_time`     DATETIME                      DEFAULT NULL
  COMMENT '发放时间',
  `grant_status`   TINYINT(8) UNSIGNED  NOT NULL DEFAULT '1'
  COMMENT '发放状态：1.发放中，2.发放完成，3.发放失败',
  `del_flag`       TINYINT(3) UNSIGNED  NOT NULL DEFAULT '1'
  COMMENT '删除标识：1.未删除，2已删除',
  `create_time`    TIMESTAMP            NOT NULL DEFAULT CURRENT_TIMESTAMP
  COMMENT '创建时间',
  `update_time`    TIMESTAMP            NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
  COMMENT '更新时间',
  PRIMARY KEY (`id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  COMMENT = '券发放记录表';

