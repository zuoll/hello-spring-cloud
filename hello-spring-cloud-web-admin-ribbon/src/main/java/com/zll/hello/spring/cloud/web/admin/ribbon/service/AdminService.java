package com.zll.hello.spring.cloud.web.admin.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Service
public class AdminService {

    @Resource
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloError")
    public String sayHi(String msg){
        return restTemplate.getForObject("http://hello-spring-cloud-service-admin/hello?msg="+msg, String.class);
    }

    public String helloError(String msg){
        return String.format("you req is bad , msg is %s", msg);
    }
}
