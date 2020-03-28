package com.ibootz.demomybatis.service.department;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ibootz.demomybatis.model.department.Department;

/**
 * TODO
 *
 * @author zhangq
 * @since 2020/3/27 16:53
 */
public interface DepartmentService extends IService<Department> {

  List<Department> findByParentIdAndDepartmentNameLikeOrderByOrderIndex(
      String parentId, String likeDepartmentName);

  int updateBatchSelective(List<Department> list);

  int batchInsert(List<Department> list);

  int insertOrUpdateSelective(Department record);

  int insertOrUpdate(Department record);
}
