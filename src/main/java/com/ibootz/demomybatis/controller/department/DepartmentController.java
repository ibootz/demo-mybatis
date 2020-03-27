package com.ibootz.demomybatis.controller.department;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
