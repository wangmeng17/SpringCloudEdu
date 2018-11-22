package com.mm.springcloud.feign.service;

import com.mm.springcloud.feign.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Auther: wang.meng
 * @Date: 2018/11/22  16:40
 * @Description:
 */
@FeignClient(value = "eureka-client1", configuration = FeignConfig.class)
public interface IFeignScheduleService {

    @GetMapping(value = "/eurekaclient1")
    String scheduleHiEurekaClient();
}
