package com.ibootz.demomybatis.controller.department;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
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

    @Resource private DepartmentService departmentService;

    @GetMapping(path = "/testCache")
    public void testCache() {
        departmentService.testCache();
    }
}
