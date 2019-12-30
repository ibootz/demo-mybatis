package com.ibootz.demomybatis.service.department;

import java.util.List;
import com.ibootz.demomybatis.model.department.Exam;
    /**
 * TODO
 * @author zhangq
 * @since 2019/12/23 16:38
 */
public interface ExamService{


    int deleteByPrimaryKey(String pid);

    int insert(Exam record);

    int insertSelective(Exam record);

    Exam selectByPrimaryKey(String pid);

    int updateByPrimaryKeySelective(Exam record);

    int updateByPrimaryKeyWithBLOBs(Exam record);

    int updateByPrimaryKey(Exam record);

    int updateBatchSelective(List<Exam> list);

    int batchInsert(List<Exam> list);

}
