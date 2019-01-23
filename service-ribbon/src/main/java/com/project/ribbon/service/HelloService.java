package com.project.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    RestTemplate template;

    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService() {
        return template.getForObject("http://EUREKA-SERVICE/hello", String.class);
    }

    String hiError() {
        return "Hello World! Has error!";
    }
}
