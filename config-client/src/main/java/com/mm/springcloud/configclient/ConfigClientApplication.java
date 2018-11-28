package com.mm.springcloud.configclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Auther: wang.meng
 * @Date: 2018/11/21  17:17
 * @Description:
 */
@EnableEurekaClient
@SpringBootApplication()
public class ConfigClientApplication {
    ////todo 待添加amqp
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class, args);
    }
}
