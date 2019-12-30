package com.ibootz.demomybatis.model.department;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * TODO
 * @author zhangq
 * @since 2019/12/23 16:38
 */
@Data
public class DepartmentBak implements Serializable {
    /**
    * 部门主键
    */
    private String pid;

    /**
    * 组织ID
    */
    private String org_id;

    /**
    * 上级部门ID
    */
    private String parent_id;

    /**
    * 部门路径
    */
    private String path;

    /**
    * 经理ID,充许存放多个经理
    */
    private String manager_user_id;

    /**
    * 部门名称
    */
    private String department_name;

    /**
    * 部门描述
    */
    private String description;

    /**
    * 创建人ID
    */
    private String creator_id;

    /**
    * 创建时间
    */
    private LocalDateTime create_time;

    /**
    * 最近更新时间
    */
    private LocalDateTime update_time;

    /**
    * 最近更新人
    */
    private String updater_id;

    /**
    * 部门职能列表(多个职能以分号分隔)
    */
    private String function_ids;

    /**
    * 部门总人数
    */
    private Integer user_count;

    /**
    * 第三方id
    */
    private String thirdparty_id;

    /**
    * 部门排序
    */
    private Integer order_index;

    /**
    * 部门名称路径
    */
    private String path_name;

    private static final long serialVersionUID = 1L;
}