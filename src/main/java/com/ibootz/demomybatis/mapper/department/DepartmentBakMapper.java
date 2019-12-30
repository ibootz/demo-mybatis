package com.ibootz.demomybatis.mapper.department;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ibootz.demomybatis.model.department.DepartmentBak;

/**
 * TODO
 *
 * @author zhangq
 * @since 2019/12/23 16:38
 */
@Mapper
public interface DepartmentBakMapper extends tk.mybatis.mapper.common.Mapper<DepartmentBak> {

  int batchInsert(@Param("list") List<DepartmentBak> list);

  List<DepartmentBak> selectByOrgId(String orgId);
}
