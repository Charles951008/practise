package com.charles.practise;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.charles.practise.mapper")
public class PractiseApplication {

    public static void main(String[] args) {
        SpringApplication.run(PractiseApplication.class, args);
    }

}
