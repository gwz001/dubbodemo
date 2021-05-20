package com.gwz.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gwz.service.HelloService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class HelloController {
    @Reference
    private HelloService helloService;

    @RequestMapping("/hello")
    public String getName(String name){
        String result = helloService.sayHello(name);
        System.out.println("result = " + result);
        return result;
    }

}
