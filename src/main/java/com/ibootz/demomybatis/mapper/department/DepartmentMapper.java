package com.ibootz.demomybatis.mapper.department;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ibootz.demomybatis.model.department.Department;

/**
 * TODO
 *
 * @author zhangq
 * @since 2020/1/16 15:29
 */
public interface DepartmentMapper extends tk.mybatis.mapper.common.Mapper<Department> {
    List<Department> selectByOrgIdAndPathLikeOrderByCreateTimeDesc(@Param("orgId") String orgId,
            @Param("likePath") String likePath);

    int updateBatch(List<Department> list);

    int batchInsert(@Param("list") List<Department> list);
}