package com.ibootz.demomybatis.service.exam;

import java.util.List;

import com.ibootz.demomybatis.model.exam.Exam;

/**
 * TODO
 *
 * @author zhangq
 * @since 2020/1/14 15:52
 */
public interface ExamService {

    int batchInsert(List<Exam> list);

    void testCache();
}
