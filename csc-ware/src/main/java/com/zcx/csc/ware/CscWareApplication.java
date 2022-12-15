package com.zcx.csc.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.zcx.csc.ware.dao")
public class CscWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(CscWareApplication.class, args);
    }

}
