package com.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

import com.model.User;
import com.service.UserService;

@RestController
public class UserController {

    UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/users")
    @CrossOrigin
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/users/{id}")
    public void getUserData(@PathVariable Long id){
        userService.getUserById(id);
        System.out.println("Method called");
    }

    @RequestMapping("/register")
    @ResponseBody
    public void registerUser(@RequestBody User user){
        userService.addUser(user);
        //System.out.println(user);
    }
    
}
