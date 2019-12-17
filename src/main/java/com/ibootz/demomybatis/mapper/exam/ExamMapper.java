package com.ibootz.demomybatis.mapper.exam;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ibootz.demomybatis.model.exam.Exam;

public interface ExamMapper {
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

  List<Exam> selectByOrgIdAndAuditStatus(
      @Param("orgId") String orgId, @Param("auditStatus") Byte auditStatus);

  int updateBatch(List<Exam> list);

  int updateBatchSelective(List<Exam> list);

  int batchInsert(@Param("list") List<Exam> list);
}
