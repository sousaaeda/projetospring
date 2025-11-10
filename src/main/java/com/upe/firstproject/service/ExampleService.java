package com.upe.firstproject.service;

import com.upe.firstproject.model.User;
import org.springframework.stereotype.Service;

@Service
public class ExampleService {

    public String test(){
        return "test - ExampleService";
    }

    public User createUser(User user){
        user.setPassword("******");
        return user;
    }
}
