package com.mm.springcloud.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: wang.meng
 * @Date: 2018/11/28  11:02
 * @Description:
 */
@RestController
@RequestMapping("/config")
public class ReadConfigController {

    //从配置中心读取foo
    @Value("${foo}")
    String foo;

    @GetMapping("/foo")
    private String readConfigInfoByFoo() {
        return foo;
    }
}
