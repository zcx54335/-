package com.zcx.csc.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@MapperScan("com.zcx.csc.product.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class CscProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(CscProductApplication.class, args);
    }

}
