package com.ibootz.demomybatis.mapper.exam;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ibootz.demomybatis.model.exam.Exam;

/**
 * TODO
 *
 * @author zhangq
 * @since 2020/1/15 10:00
 */
public interface ExamMapper {
    int deleteByPrimaryKey(String pid);

    int insert(Exam record);

    int insertSelective(Exam record);

    Exam selectByPrimaryKey(String pid);

    int updateByPrimaryKeySelective(Exam record);

    int updateByPrimaryKeyWithBLOBs(Exam record);

    int updateByPrimaryKey(Exam record);

    List<Exam> findByOrgIdAndPassType(
            @Param("orgId") String orgId, @Param("passType") Byte passType);

    int batchInsert(@Param("list") List<Exam> list);
}
