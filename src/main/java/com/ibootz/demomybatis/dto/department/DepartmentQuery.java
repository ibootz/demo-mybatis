package com.ibootz.demomybatis.dto.department;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DepartmentQuery {
  private String orgId;

  private String parentId;

  private String departmentName;

  private LocalDateTime createStartTime;

  private LocalDateTime createEndTime;

  private String thirdpartyId;
}
