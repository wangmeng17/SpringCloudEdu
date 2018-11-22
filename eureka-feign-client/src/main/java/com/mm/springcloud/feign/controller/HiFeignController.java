package com.mm.springcloud.feign.controller;

import com.mm.springcloud.feign.service.IFeignScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: wang.meng
 * @Date: 2018/11/22  16:40
 * @Description:
 */
@RestController
@RequestMapping("/feign")
public class HiFeignController {

    @Autowired
    IFeignScheduleService feignScheduleService;

    @GetMapping("/hi")
    public String hiFeign() {
        return "hi,feign schedual " + feignScheduleService.scheduleHiEurekaClient();
    }
}
