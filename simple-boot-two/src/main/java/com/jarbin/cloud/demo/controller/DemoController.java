package com.jarbin.cloud.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class DemoController {

    @Value("${config-env}")
    private String configEnv;

    @Value("${jarbin.local.one}")
    private String one;

    @Value("${jarbin.local.two}")
    private String two;

    @RequestMapping("/demo")
    public String demoRequest(){
        //String s = "local one:"+one + "; local two:"+two;
        return "configEnv:"+configEnv;
    }
}
