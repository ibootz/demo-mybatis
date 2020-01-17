package com.ibootz.demomybatis.service.department;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.ibootz.demomybatis.mapper.department.DepartmentMapper;
import com.ibootz.demomybatis.model.department.Department;

import lombok.extern.slf4j.Slf4j;

/**
 * TODO
 *
 * @author zhangq
 * @since 2020/1/14 15:48
 */
@Slf4j
@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Resource
    private DepartmentMapper departmentMapper;

    @Autowired
    private ObjectMapper jacksonObjectMapper;

    @Override
    public List<Department> selectByOrgIdAndPathLikeOrderByCreateTimeDesc(String orgId,
            String likePath) {
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
    @Transactional(rollbackFor = { Exception.class })
    public void testCache() throws JsonProcessingException {
        String orgId = "a379a935-226d-4836-8549-ba898f448d1c";
        String pid = "034649dd-e9f2-40f1-9339-9da2faaf6cce";
        String likePath = ";034649dd-e9f2-40f1-9339-9da2faaf6cce";

        // 测试更新
        Department d1 = departmentMapper.selectByPrimaryKey(pid);
        System.out.println("d1.name:" + d1.getDepartmentName());
        d1.setDepartmentName(d1.getDepartmentName() + "_1");
        departmentMapper.updateByPrimaryKey(d1);

        // 测试分页
        Page<Department> departments = PageHelper.startPage(2, 10)
                .doSelectPage(() -> departmentMapper
                        .selectByOrgIdAndPathLikeOrderByCreateTimeDesc(orgId, likePath));
    }
}
