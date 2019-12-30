package com.ibootz.demomybatis.model.department;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * TODO
 * @author zhangq
 * @since 2019/12/23 16:38
 */
@Data
public class Exam implements Serializable {
    /**
    * 考试的uuid
    */
    private String pid;

    /**
    * 机构uuid
    */
    private String orgId;

    /**
    * 考试名称
    */
    private String name;

    /**
    * 考试描述
    */
    private String description;

    /**
    * 重考次数,0-不允许,默认0
    */
    private Byte repeatNum;

    /**
    * 考试开始时间
    */
    private LocalDateTime startTime;

    /**
    * 考试截止时间
    */
    private LocalDateTime endTime;

    /**
    * 考试时长，单位为分钟，默认为30分钟
    */
    private Integer limitTime;

    /**
    * 通过类型,0-题数计算,1-分数计算
    */
    private Byte passType;

    /**
    * 通过标准，通过考试所需答对的题数
    */
    private Integer standard;

    /**
    * 总题数/总分数
    */
    private Integer totalNum;

    /**
    * 考试状态，0-保存未发布，1-已发布，2-已结束，4-已删除
    */
    private Byte status;

    /**
    * 考试难度
    */
    private Integer difficulty;

    /**
    * 批阅状态，0-不批阅，1-未批阅，2-批阅中，3-已批阅
    */
    private Byte auditStatus;

    /**
    * 是否允许回顾答题,0否1是
    */
    private Byte isReview;

    /**
    * 公布答案设置,0-结束后手动,1-结束后自动,2-员工交卷后
    */
    private Byte isOpen;

    /**
    * 是否公开成绩榜,0否1是
    */
    private Byte isPublish;

    /**
    * 是否试题打乱,0否1是
    */
    private Byte isSubjectShuffle;

    /**
    * 是否选项打乱,0否1是
    */
    private Byte isItemShuffle;

    /**
    * 是否匿名批阅,0否1是
    */
    private Byte isAnonymAudit;

    /**
    * 是否填空题自动批阅,0否1是
    */
    private Byte isCompletionAudit;

    /**
    * 客户端限制,0-PC/H5,1-仅H5,2-仅PC
    */
    private Byte clientType;

    /**
    * 考试中断次数,-1-允许中断
    */
    private Byte breakNum;

    /**
    * 学分
    */
    private Double studyPoints;

    /**
    * 关联的学习计划id
    */
    private String studyPlanId;

    /**
    * 创建人Id
    */
    private String creator;

    /**
    * 创建时间
    */
    private LocalDateTime createTime;

    /**
    * 更新者Id
    */
    private String updater;

    /**
    * 更新时间
    */
    private LocalDateTime updateTime;

    /**
    * 封面图片地址
    */
    private String logoUrl;

    /**
    * 考试暂存信息
    */
    private String pauseContent;

    private static final long serialVersionUID = 1L;
}