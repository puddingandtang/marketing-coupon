CREATE TABLE `mc_coupon_resource_biz` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `resource_id` bigint(20) unsigned NOT NULL COMMENT '资源编号',
  `biz_resource` tinyint(8) unsigned NOT NULL DEFAULT '1' COMMENT '业务来源限制：1.全部可用',
  `del_flag` tinyint(2) unsigned NOT NULL DEFAULT '1' COMMENT '是否删除：1.未删除，2.已删除',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`),
  KEY `idx_resource_id` (`resource_id`) USING BTREE,
  KEY `idx_create_time` (`create_time`) USING BTREE,
  KEY `idx_update_time` (`update_time`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='资源模版配置业务表'