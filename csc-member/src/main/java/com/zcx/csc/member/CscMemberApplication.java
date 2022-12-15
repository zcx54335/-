package com.zcx.csc.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.zcx.csc.member.dao")
public class CscMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(CscMemberApplication.class, args);
    }

}
