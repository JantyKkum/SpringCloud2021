package com.janty.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: Janty
 * @projectName: Cloud2021
 * @date: 2023/2/24 10:42
 * @description:
 */
@EnableDiscoveryClient      //注册中心通用注解
@SpringBootApplication
public class PaymentMain9001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain9001.class,args);
    }
}
