package com.preject.eureka.service.ctrl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaCtrl {

    @Value("${server.port}")
    String port;

    @RequestMapping("/hello")
    public String sayHello() {
        return "Hello World! I am from port: " + port;
    }
}
