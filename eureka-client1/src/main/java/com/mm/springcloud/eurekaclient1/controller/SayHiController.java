package com.mm.springcloud.eurekaclient1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: wang.meng
 * @Date: 2018/11/21  17:25
 * @Description:
 */
@RestController
@RequestMapping("/eureka")
public class SayHiController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/hi")
    private String sayHi() {
        return "Hi,this is eureka client 1,port:" + serverPort;
    }
}
