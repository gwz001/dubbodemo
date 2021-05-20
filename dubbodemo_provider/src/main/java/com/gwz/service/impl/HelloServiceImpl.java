package com.gwz.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.gwz.service.HelloService;
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "hello " + name;
    }
}
