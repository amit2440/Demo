package com.learn.demo.repo;

import com.learn.demo.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao implements JpaRepository<User,Intt> {


    public User getAllUsers() {
        return null;
    }
}
