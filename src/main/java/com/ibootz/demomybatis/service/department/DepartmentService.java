package com.ibootz.demomybatis.service.department;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ibootz.demomybatis.model.department.Department;

/**
 * TODO
 *
 * @author zhangq
 * @since 2020/1/17 15:18
 */
public interface DepartmentService extends IService<Department> {

  List<Department> selectByOrgIdAndPathLikeOrderByCreateTimeDesc(String orgId, String likePath);

  int updateBatchSelective(List<Department> list);

  int batchInsert(List<Department> list);
}
