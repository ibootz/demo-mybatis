package com.ibootz.demomybatis.service.department;

import java.util.List;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ibootz.demomybatis.mapper.department.DepartmentMapper;
import com.ibootz.demomybatis.model.department.Department;

/**
 * TODO
 *
 * @author zhangq
 * @since 2020/3/27 16:53
 */
@Service
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department>
    implements DepartmentService {

  @Override
  public List<Department> findByParentIdAndDepartmentNameLikeOrderByOrderIndex(
      String parentId, String likeDepartmentName) {
    return baseMapper.findByParentIdAndDepartmentNameLikeOrderByOrderIndex(
        parentId, likeDepartmentName);
  }

  @Override
  public int updateBatch(List<Department> list) {
    return baseMapper.updateBatch(list);
  }

  @Override
  public int updateBatchSelective(List<Department> list) {
    return baseMapper.updateBatchSelective(list);
  }

  @Override
  public int batchInsert(List<Department> list) {
    return baseMapper.batchInsert(list);
  }

  @Override
  public int insertOrUpdate(Department record) {
    return baseMapper.insertOrUpdate(record);
  }

  @Override
  public int insertOrUpdateSelective(Department record) {
    return baseMapper.insertOrUpdateSelective(record);
  }

  @Override
  public int insertOrUpdateWithBLOBs(Department record) {
    return baseMapper.insertOrUpdateWithBLOBs(record);
  }
}
