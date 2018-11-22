package com.mm.springcloud.ribbon.controller;

import com.mm.springcloud.ribbon.server.RibbonServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: wang.meng
 * @Date: 2018/11/22  9:47
 * @Description:
 */
@RestController()
@RequestMapping("ribbon")
public class RibbonController {

    @Autowired
    RibbonServer ribbonServer;

    @GetMapping("/hi")
    public String hiRibbon() {
        return ribbonServer.hiRibbon();
    }

    @GetMapping("/test")
    public String test() {
        return "test successful";
    }
}
