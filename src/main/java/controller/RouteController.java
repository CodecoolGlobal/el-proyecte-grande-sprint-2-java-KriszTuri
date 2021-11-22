package controller;

import model.User;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class RouteController {
    

    User user = new User();


    @GetMapping("/")
    public String mainPage(){
        return "Hello!";
    }
    /*@GetMapping("/")
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
    }*/
}
