package com.mm.spring.cloud.controller;

import com.mm.spring.cloud.bean.ConfigBean;
import com.mm.spring.cloud.bean.ConfigBean2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: wang.meng
 * @Date: 2018/11/8  16:34
 * @Description:
 */
@RestController
@EnableConfigurationProperties({ConfigBean.class, ConfigBean2.class})
public class MiyaController {
    @Value("${my.name}")
    private String name;
    @Value("${my.age}")
    private int age;

    @Autowired
    ConfigBean configBean;

    @Autowired
    ConfigBean2 configBean2;

    @RequestMapping(value = "/miya/t1", method = RequestMethod.GET)
    public String miyat1() {
        return name + ":" + age;
    }

    @RequestMapping(value = "/miya/t2", method = RequestMethod.GET)
    public String miyat2() {
        return configBean.getName() + ":" + configBean.getAge();
    }

    @RequestMapping(value = "/miya/t3", method = RequestMethod.GET)
    public String miyat3() {
        return configBean2.getName() + configBean2.getAge();
    }
}
