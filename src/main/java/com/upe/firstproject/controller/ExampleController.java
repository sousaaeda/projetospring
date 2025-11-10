package com.upe.firstproject.controller;

import com.upe.firstproject.model.User;
import com.upe.firstproject.service.ExampleService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/example")
@AllArgsConstructor
public class ExampleController {

    private ExampleService exampleService;

    @GetMapping
    public String test(){
        return exampleService.test();
    }

    @PostMapping("/create-user")
    public User createUser(@RequestBody User user){
        return exampleService.createUser(user);
    }
}
