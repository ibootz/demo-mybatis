package com.ibootz.demomybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/** @author zhangq */
@SpringBootApplication
@MapperScan("com.ibootz.demomybatis.mapper")
public class DemoMybatisApplication {

  public static void main(String[] args) {
    SpringApplication.run(DemoMybatisApplication.class, args);
  }
}
