package com.zcx.csc.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zcx.csc.order.dao")
public class CscOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(CscOrderApplication.class, args);
    }

}
