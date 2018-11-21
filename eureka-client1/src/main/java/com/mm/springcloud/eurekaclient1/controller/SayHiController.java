package com.mm.springcloud.eurekaclient1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: wang.meng
 * @Date: 2018/11/21  17:25
 * @Description:
 */
@RestController
public class SayHiController {

    @GetMapping("/eurekaclient1")
    private String sayHi() {
        return "Hi,this is eureka client 1";
    }
}
