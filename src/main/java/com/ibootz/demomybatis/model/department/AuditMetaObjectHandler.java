package com.ibootz.demomybatis.model.department;

import java.time.LocalDateTime;

import org.apache.ibatis.reflection.MetaObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;

/**
 * 自动填充审计字段
 *
 * @author zhangq
 * @since 2020/3/27 18:03
 */
@Component
public class AuditMetaObjectHandler implements MetaObjectHandler {

  private static final Logger LOGGER = LoggerFactory.getLogger(AuditMetaObjectHandler.class);

  @Override
  public void insertFill(MetaObject metaObject) {
    // 起始版本 3.3.0(推荐使用)
    this.strictInsertFill(metaObject, "createTime", LocalDateTime.class, LocalDateTime.now());
    this.strictInsertFill(metaObject, "updateTime", LocalDateTime.class, LocalDateTime.now());
  }

  @Override
  public void updateFill(MetaObject metaObject) {
    // 起始版本 3.3.0(推荐使用)
    this.strictUpdateFill(metaObject, "updateTime", LocalDateTime.class, LocalDateTime.now());
  }
}
