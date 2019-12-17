package com.ibootz.demomybatis.service.department;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ibootz.demomybatis.mapper.exam.ExamMapper;
import com.ibootz.demomybatis.model.exam.Exam;

@Service
public class ExamServiceImpl implements ExamService {

  @Resource private ExamMapper examMapper;

  @Override
  public int deleteByPrimaryKey(String pid) {
    return examMapper.deleteByPrimaryKey(pid);
  }

  @Override
  public int insert(Exam record) {
    return examMapper.insert(record);
  }

  @Override
  public int insertOrUpdate(Exam record) {
    return examMapper.insertOrUpdate(record);
  }

  @Override
  public int insertOrUpdateSelective(Exam record) {
    return examMapper.insertOrUpdateSelective(record);
  }

  @Override
  public int insertOrUpdateWithBLOBs(Exam record) {
    return examMapper.insertOrUpdateWithBLOBs(record);
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
  public List<Exam> selectByOrgIdAndAuditStatus(String orgId, Byte auditStatus) {
    return examMapper.selectByOrgIdAndAuditStatus(orgId, auditStatus);
  }

  @Override
  public int updateBatch(List<Exam> list) {
    return examMapper.updateBatch(list);
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
