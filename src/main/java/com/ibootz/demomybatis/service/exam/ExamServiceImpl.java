package com.ibootz.demomybatis.service.exam;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ibootz.demomybatis.mapper.exam.ExamMapper;
import com.ibootz.demomybatis.model.exam.Exam;

import lombok.extern.slf4j.Slf4j;

/**
 * TODO
 *
 * @author zhangq
 * @since 2020/1/14 15:52
 */
@Slf4j
@Service
public class ExamServiceImpl implements ExamService {

    @Resource private ExamMapper examMapper;

    @Override
    public int batchInsert(List<Exam> list) {
        return examMapper.batchInsert(list);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void testCache() {
        String orgId = "ddd2ddee-84af-4bf6-b1ee-e8c0e2662e54";
        Exam exam = examMapper.findByOrgIdAndPassType(orgId, (byte) 1).get(0);
        log.debug("LOG00020:exam.name:" + exam.getName());
        exam.setName(exam.getName() + "_修改");
        log.debug("LOG00040:再次查询");
        exam = examMapper.findByOrgIdAndPassType(orgId, (byte) 1).get(0);
        log.debug("LOG00020:exam.name:" + exam.getName());
    }
}
