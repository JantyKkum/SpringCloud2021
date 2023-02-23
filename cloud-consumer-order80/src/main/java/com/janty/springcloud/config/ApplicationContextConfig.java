package com.janty.springcloud.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author: Janty
 * @projectName: Cloud2021
 * @date: 2023/2/22 21:44
 * @description:
 */
//@Configuration
@SpringBootConfiguration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced       //使用ribbon开启负载均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
