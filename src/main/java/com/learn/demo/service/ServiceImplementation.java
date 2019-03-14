package com.learn.demo.service;

import com.learn.demo.pojo.User;
import com.learn.demo.repo.UserDaoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImplementation implements ServiceInterface {


    @Autowired
    UserDaoInterface userRepo;

    @Override
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }
}
