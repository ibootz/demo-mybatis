package com.ibootz.demomybatis.service.department;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.ibootz.demomybatis.model.department.Exam;
import com.ibootz.demomybatis.mapper.department.ExamMapper;
import com.ibootz.demomybatis.service.department.ExamService;
/**
 * TODO
 * @author zhangq
 * @since 2019/12/23 16:38
 */
@Service
public class ExamServiceImpl implements ExamService{

    @Resource
    private ExamMapper examMapper;

    @Override
    public int deleteByPrimaryKey(String pid) {
        return examMapper.deleteByPrimaryKey(pid);
    }

    @Override
    public int insert(Exam record) {
        return examMapper.insert(record);
    }

    @Override
    public int insertSelective(Exam record) {
        return examMapper.insertSelective(record);
    }

    @Override
    public Exam selectByPrimaryKey(String pid) {
        return examMapper.selectByPrimaryKey(pid);
    }

    @Override
    public int updateByPrimaryKeySelective(Exam record) {
        return examMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(Exam record) {
        return examMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    @Override
    public int updateByPrimaryKey(Exam record) {
        return examMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatchSelective(List<Exam> list) {
        return examMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Exam> list) {
        return examMapper.batchInsert(list);
    }

}
