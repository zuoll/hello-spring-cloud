package com.zll.hello.spring.cloud.web.admin.feign.controller;


import com.zll.hello.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class AdminController {

    @Resource
    private AdminService adminService;

    @GetMapping("/hello")
    public String sayHello(String msg){
        return adminService.sayHello(msg);
    }
}
