package com.ibootz.demomybatis.service.department;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ibootz.demomybatis.mapper.department.DepartmentBakMapper;
import com.ibootz.demomybatis.model.department.DepartmentBak;
/**
 * TODO
 *
 * @author zhangq
 * @since 2019/12/23 16:38
 */
@Service
public class DepartmentBakServiceImpl implements DepartmentBakService {

  @Resource private DepartmentBakMapper departmentBakMapper;

  @Override
  public int insert(DepartmentBak record) {
    return departmentBakMapper.insert(record);
  }

  @Override
  public int insertSelective(DepartmentBak record) {
    return departmentBakMapper.insertSelective(record);
  }

  @Override
  public int batchInsert(List<DepartmentBak> list) {
    return departmentBakMapper.batchInsert(list);
  }
}
