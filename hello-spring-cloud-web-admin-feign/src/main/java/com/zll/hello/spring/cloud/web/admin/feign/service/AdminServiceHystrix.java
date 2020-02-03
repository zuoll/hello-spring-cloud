package com.zll.hello.spring.cloud.web.admin.feign.service;


import org.springframework.stereotype.Component;

@Component
public class AdminServiceHystrix implements AdminService {

    @Override
    public String sayHello(String msg) {
        return "hello yuo msg is "+msg+", this is bad request";
    }
}
