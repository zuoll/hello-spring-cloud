package com.zll.hello.spring.cloud.service.admin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/hello")
    public String sayHello(@RequestParam("msg") String message){
        return String.format("your msg is %s , i am port  from %s", message, port);
    }
}
