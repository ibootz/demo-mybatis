package com.ibootz.demomybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tk.mybatis.spring.annotation.MapperScan;

/** @author zhangq */
@SpringBootApplication
@MapperScan(basePackages = "com.ibootz.demomybatis.mapper")
public class DemoMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoMybatisApplication.class, args);
    }
}
