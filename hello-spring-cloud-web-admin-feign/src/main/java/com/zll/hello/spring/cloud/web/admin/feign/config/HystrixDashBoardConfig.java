package com.zll.hello.spring.cloud.web.admin.feign.config;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import java.util.Collections;

//@Configuration
public class HystrixDashBoardConfig {

    @Bean
    public ServletRegistrationBean getServlet(){
        HystrixMetricsStreamServlet hystrixServlet = new HystrixMetricsStreamServlet();
        ServletRegistrationBean bean = new ServletRegistrationBean(hystrixServlet);

        bean.setLoadOnStartup(1);
        bean.setUrlMappings(Collections.singleton("/hystrix.stream"));
        bean.setName("hystrixServlet");
        return bean;
    }
}
