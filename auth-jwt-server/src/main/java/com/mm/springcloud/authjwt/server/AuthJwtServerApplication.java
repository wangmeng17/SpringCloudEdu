package com.mm.springcloud.authjwt.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by fangzhipeng on 2017/6/1.
 */
@SpringBootApplication
@EnableEurekaClient
public class AuthJwtServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(AuthJwtServerApplication.class, args);
	}
}
