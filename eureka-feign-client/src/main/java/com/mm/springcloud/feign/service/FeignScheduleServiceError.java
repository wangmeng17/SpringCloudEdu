package com.mm.springcloud.feign.service;

import org.springframework.stereotype.Component;

/**
 * @Auther: wang.meng
 * @Date: 2018/11/23  9:55
 * @Description:
 */
@Component
public class FeignScheduleServiceError implements IFeignScheduleService {
    @Override
    public String scheduleHiEurekaClient() {
        return "sorry,eureka-client1 has error";
    }
}
