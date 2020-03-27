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
 * @since 2020/1/17 15:18
 */
@Service
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department>
    implements DepartmentService {

  @Override
  public List<Department> selectByOrgIdAndPathLikeOrderByCreateTimeDesc(
      String orgId, String likePath) {
    return baseMapper.selectByOrgIdAndPathLikeOrderByCreateTimeDesc(orgId, likePath);
  }

  @Override
  public int updateBatchSelective(List<Department> list) {
    return baseMapper.updateBatchSelective(list);
  }

  @Override
  public int batchInsert(List<Department> list) {
    return baseMapper.batchInsert(list);
  }
}
