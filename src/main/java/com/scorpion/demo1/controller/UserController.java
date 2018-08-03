package com.scorpion.demo1.controller;

import com.scorpion.demo1.Service.DBConnector;
import com.scorpion.demo1.domain.ConfigTestBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Value("${server.display.name}")
    private String name;

    @Autowired
    ConfigTestBean configTestBean;

    @Autowired
    DBConnector connector;

    @RequestMapping("/")
    public String index(){
        return configTestBean.getName() + configTestBean.getWant();
    }

    @RequestMapping("/task")
    public String helloTask(){
        connector.configure();
        return "hello task !! myage is ";
    }

}
