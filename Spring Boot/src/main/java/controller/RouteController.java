package controller;

import model.User;
import model.Users;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class RouteController {
    Users user = new Users();
    int index = 0;

    @GetMapping("/")
    public String mainPage(){
        //greenhouseService.addGreenhouse();
        return "Hello there!";
    }

    @GetMapping("/register/{name}/{email}/{password}")
    public User register(@PathVariable String name, @PathVariable String email, @PathVariable String password){
        user.setUserId(1);
        user.setUsername(name);
        user.setEmail(email);
        user.setPassword(password);
        return user;
    }

    public User testUser(){
        user.setUserId(index);
        user.setUsername("user"+index);
        user.setEmail("email"+index+"@email.com");
        user.setPassword("password"+index);
        index++;
        return user;
    }

    @GetMapping("/test")
    @CrossOrigin
    public ArrayList<Map<String, String>> saveUser() {
        testUser();
        LinkedHashMap<String, String> map = new LinkedHashMap<String, String>(); //Linked HashMaps: the data is stored in the order we declared
        map.put("id", String.valueOf(user.getUserId()));
        map.put("email", user.getEmail());
        map.put("username", user.getUsername());
        map.put("password", user.getPassword());
        user.addToUserList(map);
        System.out.println(user.returnUserList());
        return user.returnUserList();
    }
    
}
