package com.zll.hello.spring.cloud.web.admin.ribbon.controller;

import com.zll.hello.spring.cloud.web.admin.ribbon.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/web/hello")
    public String getSayHello(String msg){
        return adminService.sayHi(msg);
    }
}
