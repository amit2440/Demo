package com.learn.demo.pojo;

import com.learn.demo.service.ServiceInterface;
import lombok.Data;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Entity
@Data
public class User {

    @Id
    @Column(name = "userId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userId;

    private String name;

}
