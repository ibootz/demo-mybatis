package com.ibootz.demomybatis.service.department;

import java.util.List;

import com.ibootz.demomybatis.model.exam.Exam;

public interface ExamService {

  int deleteByPrimaryKey(String pid);

  int insert(Exam record);

  int insertOrUpdate(Exam record);

  int insertOrUpdateSelective(Exam record);

  int insertOrUpdateWithBLOBs(Exam record);

  int insertSelective(Exam record);

  Exam selectByPrimaryKey(String pid);

  int updateByPrimaryKeySelective(Exam record);

  int updateByPrimaryKeyWithBLOBs(Exam record);

  int updateByPrimaryKey(Exam record);

  List<Exam> selectByOrgIdAndAuditStatus(String orgId, Byte auditStatus);

  int updateBatch(List<Exam> list);

  int updateBatchSelective(List<Exam> list);

  int batchInsert(List<Exam> list);
}
