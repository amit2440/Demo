package com.learn.demo.controller;

import com.learn.demo.pojo.User;
import com.learn.demo.service.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoController {

    @Autowired
    ServiceInterface service;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String hello(){
        return "Hello Universe";
    }

    @RequestMapping(value = "/findAllUsers",method = RequestMethod.GET)
    public List<User> getAllUsers(){
        return service.getAllUsers();
    }
}
