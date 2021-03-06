package com.ibootz.demomybatis.mapper.department;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ibootz.demomybatis.dto.department.DepartmentQuery;
import com.ibootz.demomybatis.model.department.Department;

/**
 * TODO
 *
 * @author zhangq
 * @since 2020/3/27 17:15
 */
@SuppressWarnings("ClassWithoutLogger")
public interface DepartmentMapper extends BaseMapper<Department> {
  List<Department> findByParentIdAndDepartmentNameLikeOrderByOrderIndex(
      @Param("parentId") String parentId, @Param("likeDepartmentName") String likeDepartmentName);

  int updateBatch(@Param("list") List<Department> list);

  int updateBatchSelective(List<Department> list);

  int batchInsert(@Param("list") List<Department> list);

  int insertOrUpdate(Department record);

  int insertOrUpdateSelective(Department record);

  int insertOrUpdateWithBLOBs(Department record);

  List<Department> findByOrgId(@Param("orgId") String orgId);

  IPage<Department> selectPages(Page<Department> page, @Param("dto") DepartmentQuery dto);
}
