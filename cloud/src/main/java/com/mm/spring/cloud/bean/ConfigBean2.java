package com.mm.spring.cloud.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Auther: wang.meng
 * @Date: 2018/11/8  16:59
 * @Description:
 */
@Configuration
@PropertySource(value = "classpath:test.properties")
@ConfigurationProperties(prefix = "com.mm.spring.cloud")
@Data
public class ConfigBean2 {
    private String name;
    private int age;
}
