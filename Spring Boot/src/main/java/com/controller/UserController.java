package com.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.NoSuchElementException;

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

    @ExceptionHandler
    public void userNotFoundHandler(NoSuchElementException e, HttpRequest req, HttpResponse resp){
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<User> getUserData(@PathVariable Long id){
        
        /*ResponseEntity<> user = userService.getUserById(id);
        System.out.println("Method called");*/
        try {
            return ResponseEntity.ok(userService.getUserById(id));
            //return new ResponseEntity<>(userService.getUserById(id),HttpStatus.OK);
        } catch (Exception e) {
            //throw new ResponseEntity<>("asd",HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(userService.getUserById(id),HttpStatus.OK);
    }

    @PostMapping("/register")
    @CrossOrigin
    public void registerUser(@RequestBody User user){
        userService.addUser(user);
        System.out.println(user.getUsername());
    }
    
}
