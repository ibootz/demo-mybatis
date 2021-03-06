package com.ibootz.demomybatis.mapper.department;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ibootz.demomybatis.dto.department.DepartmentQuery;
import com.ibootz.demomybatis.model.department.Department;
import com.ibootz.demomybatis.service.department.DepartmentService;

import cn.hutool.core.date.DateField;
import cn.hutool.core.util.RandomUtil;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * TODO
 *
 * @author zhangq
 * @since 2020/3/27 16:59
 */
@SpringBootTest
// @Transactional
class departmentServiceTest extends SpringExtension {

  @Autowired DepartmentService departmentService;

  @Test
  void batchInsert() {
    List<Department> departments = buildDepartments(1000);
    int rs = departmentService.batchInsert(departments);
    assertEquals(1000, rs);
  }

  @Test
  void saveBatch() {
    List<Department> departments = buildDepartments(1000);
    boolean rs = departmentService.saveBatch(departments);
    assertTrue(rs);
  }

  @Test
  void insertOrUpdate() {
    Department dp = departmentService.getById("1243832635023765506");
    dp.setPathName(dp.getPathName() + "-update");
    dp.setCreateTime(LocalDateTime.parse("7777-12-31T23:59:59", DateTimeFormatter.ISO_DATE_TIME));
    int rs = departmentService.insertOrUpdate(dp);
    assertEquals(2, rs);
  }

  @Test
  void update() {
    Department dept = departmentService.getById("1243885524257615880");
    dept.setPathName(dept.getPathName() + "-update");
    boolean rs = departmentService.updateById(dept);
    assertTrue(rs);
  }

  @Test
  void insertOrUpdateSelective() {
    Department dept = departmentService.getById("1243885524257615879");
    dept.setPathName(dept.getPathName() + "-update");
    dept.setUpdateTime(null);
    int rs = departmentService.insertOrUpdateSelective(dept);
    assertEquals(2, rs);
  }

  @Test
  void selectPage() {
    Page<Department> page = new Page<>(9, 10, true);
    page.addOrder(OrderItem.asc("orderIndex"), OrderItem.desc("createTime"));
    DepartmentQuery dto = new DepartmentQuery();
    dto.setCreateStartTime(
        LocalDateTime.parse("2020-03-29T18:00:01", DateTimeFormatter.ISO_LOCAL_DATE_TIME));
    dto.setCreateEndTime(
        LocalDateTime.parse("2020-03-29T18:30:01", DateTimeFormatter.ISO_LOCAL_DATE_TIME));
    IPage<Department> iPage = departmentService.selectPages(page, dto);
    System.out.println(
        iPage.getTotal()
            + "\t"
            + iPage.getSize()
            + "\t"
            + iPage.getCurrent()
            + "\t"
            + iPage.getPages());

    iPage
        .getRecords()
        .forEach(
            department ->
                System.out.println(department.getCreateTime() + ":" + department.getOrderIndex()));
  }

  @Test
  void insertOrUpdateWithBLOBs() {}

  @Test
  void updateBatch() {}

  @Test
  void updateBatchSelective() {}

  @Test
  void findByParentIdAndDepartmentNameLikeOrderByOrderIndex() {}

  private List<Department> buildDepartments(int size) {
    List<Department> departments = new ArrayList<>();
    for (int i = 0; i < size; i++) {
      departments.add(buildDepartment());
    }
    return departments;
  }

  private Department buildDepartment() {
    long randomPost = RandomUtil.randomLong(0, Long.MAX_VALUE);
    LocalDateTime randomDate =
        LocalDateTime.ofInstant(
            RandomUtil.randomDate(new Date(), DateField.SECOND, -10000, 10000).toInstant(),
            ZoneId.systemDefault());
    return Department.builder()
        .orgId("orgId-" + randomPost)
        .createTime(randomDate)
        .creatorId("creatorId-" + randomPost)
        .departmentName("departmentName-" + randomPost)
        .description("desc-" + randomPost)
        .orderIndex(RandomUtil.randomLong(100))
        .functionIds("")
        .managerUserId("")
        .parentId("parentId-" + randomPost)
        .path("path-" + randomPost)
        .pathName("pathName-" + randomPost)
        .thirdpartyId("thirdpartyId-" + randomPost)
        .updaterId("updaterId-" + randomPost)
        .updateTime(randomDate)
        .userCount(RandomUtil.randomInt(0, 999))
        .build();
  }

  public static void main(String[] args) {
    parseInfo("1243807836113227778");
    parseInfo("1243807836167753730");
    parseInfo("1243807836167753731");
    parseInfo("1243807836167753732");
    parseInfo("1243807836167753739");
    parseInfo("1243807836167753740");
  }

  private static final long twepoch = 1288834974657L;
  private static final int sequenceBits = 12;
  private static final int workerIdBits = 5;
  private static final int datacenterIdBits = 5;
  private static final int workerIdShift = sequenceBits;
  private static final int datacenterIdShift = sequenceBits + workerIdBits;
  private static final int timestampLeftShift = sequenceBits + workerIdBits + datacenterIdBits;

  // 反向解析由雪花算法生成的id
  public static void parseInfo(String id) {
    id = Long.toBinaryString(Long.parseLong(id));
    int len = id.length();
    int sequenceStart = len < workerIdShift ? 0 : len - workerIdShift;
    int workerStart = len < datacenterIdShift ? 0 : len - datacenterIdShift;
    int timeStart = len < timestampLeftShift ? 0 : len - timestampLeftShift;
    String sequence = id.substring(sequenceStart, len);
    String workerId = sequenceStart == 0 ? "0" : id.substring(workerStart, sequenceStart);
    String dataCenterId = workerStart == 0 ? "0" : id.substring(timeStart, workerStart);
    String time = timeStart == 0 ? "0" : id.substring(0, timeStart);
    int sequenceInt = Integer.valueOf(sequence, 2);
    int workerIdInt = Integer.valueOf(workerId, 2);
    int dataCenterIdInt = Integer.valueOf(dataCenterId, 2);
    long diffTime = Long.parseLong(time, 2);
    long timeLong = diffTime + twepoch;
    String date =
        LocalDateTime.ofInstant(Instant.ofEpochMilli(timeLong), ZoneId.systemDefault()).toString();
    System.out.println(
        "date:"
            + date
            + "; dataCenterIdInt:"
            + dataCenterIdInt
            + "; workerIdInt:"
            + workerIdInt
            + "; sequenceInt:"
            + sequenceInt);
  }
}
