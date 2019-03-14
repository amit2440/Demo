package com.learn.demo.service;

import com.learn.demo.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ServiceInterface {

    List<User> getAllUsers();
}
