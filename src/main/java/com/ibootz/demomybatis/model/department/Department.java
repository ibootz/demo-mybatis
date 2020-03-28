package com.ibootz.demomybatis.model.department;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Builder;
import lombok.Data;

/**
 * TODO
 *
 * @author zhangq
 * @since 2020/3/27 17:15
 */
@Data
@Builder
@TableName(value = "mb_department")
public class Department implements Serializable {
  /** 部门主键 */
  @TableId(value = "pid", type = IdType.ASSIGN_ID)
  private Long pid;

  /** 组织ID */
  @TableField(value = "orgId")
  private String orgId;

  /** 上级部门ID */
  @TableField(value = "parentId")
  private String parentId;

  /** 部门路径 */
  @TableField(value = "path")
  private String path;

  /** 经理ID,充许存放多个经理 */
  @TableField(value = "managerUserId")
  private String managerUserId;

  /** 部门名称 */
  @TableField(value = "departmentName")
  private String departmentName;

  /** 部门描述 */
  @TableField(value = "description")
  private String description;

  /** 创建人ID */
  @TableField(value = "creatorId")
  private String creatorId;

  /** 创建时间 */
  @TableField(value = "createTime", fill = FieldFill.INSERT)
  private LocalDateTime createTime;

  /** 最近更新时间 */
  @TableField(value = "updateTime", fill = FieldFill.INSERT_UPDATE, update = "now()")
  private LocalDateTime updateTime;

  /** 最近更新人 */
  @TableField(value = "updaterId")
  private String updaterId;

  /** 部门职能列表(多个职能以分号分隔) */
  @TableField(value = "functionIds")
  private String functionIds;

  /** 部门总人数 */
  @TableField(value = "userCount")
  private Integer userCount;

  /** 第三方id */
  @TableField(value = "thirdpartyId")
  private String thirdpartyId;

  /** 部门排序 */
  @TableField(value = "orderIndex")
  private Long orderIndex;

  /** 部门名称路径 */
  @TableField(value = "pathName")
  private String pathName = "";

  private static final long serialVersionUID = 1L;
}
