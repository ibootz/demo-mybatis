package com.ibootz.demomybatis.mapper.department;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ibootz.demomybatis.model.department.Department;

/**
 * TODO
 *
 * @author zhangq
 * @since 2020/1/17 15:18
 */
public interface DepartmentMapper extends BaseMapper<Department> {
  List<Department> selectByOrgIdAndPathLikeOrderByCreateTimeDesc(
      @Param("orgId") String orgId, @Param("likePath") String likePath);

  int updateBatchSelective(List<Department> list);

  int batchInsert(@Param("list") List<Department> list);
}
