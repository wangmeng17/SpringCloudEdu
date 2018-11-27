package com.mm.springcloud.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Auther: wang.meng
 * @Date: 2018/11/21  10:58
 * @Description:
 */
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class EurekaZuulClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaZuulClientApplication.class, args);
    }
}
