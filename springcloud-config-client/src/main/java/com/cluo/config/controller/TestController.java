package com.cluo.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author luolei
 * @Date 2019/8/12 9:34
 */
@RestController
@RefreshScope
public class TestController {

    @Value("${from}")
    private String from;

    @GetMapping("/from")
    public String hello(){
        return this.from;
    }
}
