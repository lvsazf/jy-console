package com.lvsazf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @author 路智顺
 * @Description
 * @date 22:56 2018-12-27
 */
@EnableCaching
@SpringBootApplication
@MapperScan("com.lvsazf.mapper")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }





}
