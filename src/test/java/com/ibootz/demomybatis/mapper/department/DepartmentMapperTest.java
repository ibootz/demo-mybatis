package com.ibootz.demomybatis.mapper.department;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.ibootz.demomybatis.model.department.Department;

import cn.hutool.core.util.RandomUtil;

/**
 * TODO
 *
 * @author zhangq
 * @since 2020/3/27 16:59
 */
class DepartmentMapperTest extends SpringExtension {

  @Autowired DepartmentMapper departmentMapper;

  @Test
  void batchInsert() {
    buildDepartments(12);
  }

  private void buildDepartments(int size) {
    List<Department> departments = new ArrayList<Department>();
    long randomPost = RandomUtil.randomLong(10);
    // TODO
//    Department dept =
//        Department.builder()
//            .orgId("orgId-" + randomPost)
//            .createTime(LocalDateTime.now())
//            .creatorId()
//            .departmentName()
//            .description()
//            .functionIds()
//            .managerUserId()
//            .orderIndex()
//            .parentId()
//            .path()
//            .pathName()
//            .thirdpartyId()
//            .updaterId()
//            .updateTime()
//            .userCount()
//            .build();
  }

  @Test
  void insertOrUpdate() {}

  @Test
  void insertOrUpdateSelective() {}

  @Test
  void insertOrUpdateWithBLOBs() {}

  @Test
  void updateBatch() {}

  @Test
  void updateBatchSelective() {}

  @Test
  void findByParentIdAndDepartmentNameLikeOrderByOrderIndex() {}
}
