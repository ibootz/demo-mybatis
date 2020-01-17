package com.ibootz.demomybatis.service.department;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ibootz.demomybatis.model.department.Department;

/**
 * TODO
 *
 * @author zhangq
 * @since 2020/1/14 15:48
 */
public interface DepartmentService {

    List<Department> selectByOrgIdAndPathLikeOrderByCreateTimeDesc(String orgId, String likePath);

    int updateBatch(List<Department> list);

    int batchInsert(List<Department> list);

    @Transactional(rollbackFor = { Exception.class })
    void testCache() throws JsonProcessingException;
}
