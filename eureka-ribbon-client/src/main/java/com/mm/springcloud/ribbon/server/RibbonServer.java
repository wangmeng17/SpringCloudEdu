package com.mm.springcloud.ribbon.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: wang.meng
 * @Date: 2018/11/22  9:43
 * @Description:
 */
@Service
public class RibbonServer {

    @Autowired
    RestTemplate restTemplate;

    public String hiRibbon() {
        return restTemplate.getForObject("http://eureka-client1/eurekaclient1", String.class);
    }
}
