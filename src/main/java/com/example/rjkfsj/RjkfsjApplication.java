package com.example.rjkfsj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.rjkfsj.mapper")    //扫描数据库mapper
public class RjkfsjApplication {

    public static void main(String[] args) {
        SpringApplication.run(RjkfsjApplication.class, args);
    }

}
