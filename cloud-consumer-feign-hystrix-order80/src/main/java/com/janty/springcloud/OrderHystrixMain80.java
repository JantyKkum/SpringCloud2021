package com.janty.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author: Janty
 * @projectName: Cloud2021
 * @date: 2023/2/23 15:31
 * @description:
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableHystrix          //开启自动降级
public class OrderHystrixMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderHystrixMain80.class,args);
    }
}
