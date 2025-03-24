package com.restapp.journal.controller;


import com.restapp.journal.entity.User;
import com.restapp.journal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/public")
public class PublicController {




    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAll();
    }

    @PostMapping("/create-user")
    public void createUser(@RequestBody User user){
        userService.saveNewUser(user);
    }

    @GetMapping("/health-check")
    public String healthCheck(){
        return "Ok";
    }
}
