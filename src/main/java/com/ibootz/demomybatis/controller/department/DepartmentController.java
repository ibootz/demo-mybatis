package com.ibootz.demomybatis.controller.department;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibootz.demomybatis.model.department.Department;
import com.ibootz.demomybatis.service.department.DepartmentService;

/**
 * TODO
 *
 * @author zhangq
 * @since 2019/12/18 16:52
 */
@RestController
@RequestMapping("/departments")
public class DepartmentController {

  @Autowired private DepartmentService departmentService;

  @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
  public Department getDepartment(@PathVariable String id) {
    return departmentService.selectByPrimaryKey(id);
  }

  @PostMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
  public void updateDepartment() {
    String orgId = "a379a935-226d-4836-8549-ba898f448d1c";
    String likePath = ";06e8658b-c9c2-4751-9df9-85d701d34053";
    List<Department> departments =
        departmentService.selectByOrgIdAndPathLikeOrderByCreateTimeDesc(orgId, likePath);
    for (Department department : departments) {
      department.setDescription(department.getDepartmentName());
    }

    departmentService.updateBatchSelective(departments);
  }
}
