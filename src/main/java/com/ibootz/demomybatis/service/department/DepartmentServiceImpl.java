package com.ibootz.demomybatis.service.department;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ibootz.demomybatis.dto.department.DepartmentQuery;
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
  public int updateBatchSelective(List<Department> list) {
    return baseMapper.updateBatchSelective(list);
  }

  @Override
  @Transactional(rollbackFor = Exception.class)
  public int batchInsert(List<Department> list) {
    return baseMapper.batchInsert(list);
  }

  @Override
  public int insertOrUpdateSelective(Department record) {
    return baseMapper.insertOrUpdateSelective(record);
  }

  @Override
  public int insertOrUpdate(Department record) {
    return baseMapper.insertOrUpdate(record);
  }

  @Override
  public int updateBatch(List<Department> list) {
    return baseMapper.updateBatch(list);
  }

  @Override
  public IPage<Department> selectPages(Page<Department> page, DepartmentQuery dto) {
    return baseMapper.selectPages(page, dto);
  }
}
