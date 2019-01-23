package com.project.ribbon.ctrl;

import com.project.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCtrl {

    @Autowired
    HelloService service;

    @RequestMapping(value = "/hello")
    public String hi() {
        return service.hiService();
    }

}
