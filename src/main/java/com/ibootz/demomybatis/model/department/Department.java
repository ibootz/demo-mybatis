package com.ibootz.demomybatis.model.department;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * TODO
 *
 * @author zhangq
 * @since 2020/1/16 15:29
 */
@Data
@Table(name = "core_department")
public class Department implements Serializable {
    /** 部门主键 */
    @Id
    @Column(name = "pid")
    @GeneratedValue(generator = "JDBC")
    private String pid;

    /** 组织ID */
    @Column(name = "orgId")
    private String orgId;

    /** 上级部门ID */
    @Column(name = "parentId")
    private String parentId;

    /** 部门路径 */
    @Column(name = "`path`")
    private String path;

    /** 经理ID,充许存放多个经理 */
    @Column(name = "managerUserId")
    private String managerUserId;

    /** 部门名称 */
    @Column(name = "departmentName")
    private String departmentName;

    /** 部门描述 */
    @Column(name = "description")
    private String description;

    /** 创建人ID */
    @Column(name = "creatorId")
    private String creatorId;

    /** 创建时间 */
    @Column(name = "createTime")
    private LocalDateTime createTime;

    /** 最近更新时间 */
    @Column(name = "updateTime")
    private LocalDateTime updateTime;

    /** 最近更新人 */
    @Column(name = "updaterId")
    private String updaterId;

    /** 部门职能列表(多个职能以分号分隔) */
    @Column(name = "functionIds")
    private String functionIds;

    /** 部门总人数 */
    @Column(name = "userCount")
    private Integer userCount;

    /** 第三方id */
    @Column(name = "thirdpartyId")
    private String thirdpartyId;

    /** 部门排序 */
    @Column(name = "orderIndex")
    private Integer orderIndex;

    /** 部门名称路径 */
    @Column(name = "pathName")
    private String pathName;

    private static final long serialVersionUID = 1L;
}
