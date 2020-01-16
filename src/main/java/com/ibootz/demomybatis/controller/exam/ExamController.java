package com.ibootz.demomybatis.controller.exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibootz.demomybatis.service.exam.ExamService;

/**
 * TODO
 *
 * @author zhangq
 * @since 2019/12/30 16:03
 */
@RestController
@RequestMapping("/exams")
public class ExamController {

    @Autowired private ExamService examService;

    @GetMapping(value = "/testCache")
    public void testCache() {
        examService.testCache();
    }
}
