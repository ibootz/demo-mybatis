package com.ibootz.demomybatis.service.exam;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * TODO
 *
 * @author zhangq
 * @since 2019/12/30 16:23
 */
@ExtendWith(SpringExtension.class)
@SpringBootTest
class ExamServiceImplTest {

    @Autowired ExamService examService;

    @BeforeEach
    void setUp() {}

    @AfterEach
    void tearDown() {}

    @Test
    void testCache() {}
}
