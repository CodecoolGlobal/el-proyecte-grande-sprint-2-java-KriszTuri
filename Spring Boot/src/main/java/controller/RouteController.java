package controller;

import model.User;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class RouteController {
    User user = new User();

    @GetMapping("/")
    public String mainPage(){
        //greenhouseService.addGreenhouse();
        return "Hello there!";
    }

    @GetMapping("/registration/{userId}-{username}-{email}-{password}")
    @ResponseBody
    public String registerUser(@PathVariable int userId,@PathVariable String username, @PathVariable String password, @PathVariable String email){
        user.setUserId(userId);
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(password);
        user.addToUserList(user);
        return "User registered!";
    }

    @GetMapping("/log-in")
    public String logIn(){
        return "Logging in...";
    }

    @GetMapping("/user/{id}")
    @ResponseBody
    public String userData(@PathVariable String id){
        return id;
    }

    @CrossOrigin
    @GetMapping("/users/testusers")
    public ArrayList<User> saveTestUsers() {
        user.setUserId(1);
        user.setUsername("user1");
        user.setEmail("email@email.com");
        user.setPassword("123");
        user.addToUserList(user);
        User user2 = new User();
        user2.setUserId(2);
        user2.setUsername("user2");
        user2.setEmail("email2@email.com");
        user2.setPassword("1234");
        user.addToUserList(user2);
        return user.returnUserList();
    }
    
}
