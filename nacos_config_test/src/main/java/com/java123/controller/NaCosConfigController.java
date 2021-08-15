package com.java123.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("/nacos")
public class NaCosConfigController {

    @Value("${java1234.name}")
    private String name;

    @Value("${java1234.age}")
    private String age;


    @RequestMapping("/test")
    public String getConfigInfo() {
        return name + " : " + age;
    }
}
