package com.mm.spring.cloud.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Auther: wang.meng
 * @Date: 2018/11/8  16:40
 * @Description:对应bean_config.yml
 */
@ConfigurationProperties(prefix = "my")
@Component
@Data
public class ConfigBean {
    private String name;
    private String age;

}
