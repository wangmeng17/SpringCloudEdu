package com.mm.springcloud.eurekaclient1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Auther: wang.meng
 * @Date: 2018/11/21  17:17
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaClient1Application {
    public static void main(String[] args) {
        SpringApplication.run(EurekaClient1Application.class, args);
    }
}
