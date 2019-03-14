package com.learn.demo.repo;

import com.learn.demo.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface UserDaoInterface extends JpaRepository<User,Integer> {


}
