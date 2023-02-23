package com.janty.springcloud.config;

import feign.Logger;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * @author: Janty
 * @projectName: Cloud2021
 * @date: 2023/2/23 14:31
 * @description:
 */
@SpringBootConfiguration
public class FeignLoggerLevelConfig {

    @Bean
    public Logger.Level getLoggerLevel(){
        return Logger.Level.FULL;
    }
}
