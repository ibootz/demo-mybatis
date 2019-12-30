package com.ibootz.demomybatis.mapper.department;

import com.ibootz.demomybatis.model.department.Exam;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * TODO
 * @author zhangq
 * @since 2019/12/23 16:38
 */
@Mapper
public interface ExamMapper {
    int deleteByPrimaryKey(String pid);

    int insert(Exam record);

    int insertSelective(Exam record);

    Exam selectByPrimaryKey(String pid);

    int updateByPrimaryKeySelective(Exam record);

    int updateByPrimaryKeyWithBLOBs(Exam record);

    int updateByPrimaryKey(Exam record);

    int updateBatchSelective(List<Exam> list);

    int batchInsert(@Param("list") List<Exam> list);
}