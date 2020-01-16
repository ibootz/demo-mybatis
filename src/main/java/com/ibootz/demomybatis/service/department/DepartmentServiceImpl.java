package com.ibootz.demomybatis.service.department;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ibootz.demomybatis.mapper.department.DepartmentMapper;
import com.ibootz.demomybatis.model.department.Department;

import lombok.extern.slf4j.Slf4j;
import tk.mybatis.mapper.entity.Example;

/**
 * TODO
 *
 * @author zhangq
 * @since 2020/1/14 15:48
 */
@Slf4j
@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Resource private DepartmentMapper departmentMapper;

    @Override
    public List<Department> selectByOrgIdAndPathLikeOrderByCreateTimeDesc(
            String orgId, String likePath) {
        return departmentMapper.selectByOrgIdAndPathLikeOrderByCreateTimeDesc(orgId, likePath);
    }

    @Override
    public int updateBatch(List<Department> list) {
        return departmentMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<Department> list) {
        return departmentMapper.batchInsert(list);
    }

    @Override
    @Transactional(rollbackFor = {Exception.class})
    public void testCache() {
        String orgId = "d08e9dec-8e61-4736-a205-7c9f08de3f33";
        String pathLike =
                ";c38237f4-de5a-4a56-8e0f-81f7d1b0121e;000f5685-b92e-4300-967d-d18ac65e679a;83d53836-89e7-4bf2-8071-feb1b5a3c638";
        Department dept =
                departmentMapper
                        .selectByOrgIdAndPathLikeOrderByCreateTimeDesc(orgId, pathLike)
                        .get(0);
        Department example = new Department();
        example.setOrgId(orgId);
        int count = departmentMapper.selectCount(example);
        System.out.println(count);
    }
}
