package com.zcx.csc.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.zcx.csc.coupon.dao")
public class CscCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(CscCouponApplication.class, args);
    }

}
