package com.ibootz.demomybatis.service.department;

import java.util.List;
import com.ibootz.demomybatis.model.department.DepartmentBak;
    /**
 * TODO
 * @author zhangq
 * @since 2019/12/23 16:38
 */
public interface DepartmentBakService{


    int insert(DepartmentBak record);

    int insertSelective(DepartmentBak record);

    int batchInsert(List<DepartmentBak> list);

}
