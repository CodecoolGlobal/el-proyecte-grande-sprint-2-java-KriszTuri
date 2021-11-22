package controller;

import model.User;
import model.Users;

import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class RouteController {
    Users user = new Users();

    @GetMapping("/")
    public String mainPage(){
        //greenhouseService.addGreenhouse();
        return "Hello there!";
    }

    @GetMapping("/register/{name}/{email}/{password}")
    public User logIn(@PathVariable String name, @PathVariable String email, @PathVariable String password){
        user.setUserId(1);
        user.setUsername(name);
        user.setEmail(email);
        user.setPassword(password);
        return user;
    }

    @GetMapping("/user/{id}")
    @ResponseBody
    public String userData(@PathVariable String id){
        return id;
    }


    /*@GetMapping("/users/list")
    @ResponseBody
    @CrossOrigin
    public ArrayList<Users> saveTestUsers() {
        user.setUserId(1);
        user.setUsername("user1");
        user.setEmail("email@email.com");
        user.setPassword("123");
        user.addToUserList(user);
        /*Users user2 = new Users();
        user2.setUserId(2);
        user2.setUsername("user2");
        user2.setEmail("email2@email.com");
        user2.setPassword("1234");
        user.addToUserList(user2);
        return user.returnUserList();
    }*/
 
    @GetMapping("/test")
    @CrossOrigin
    public Map<String, String> sayHello() {
        HashMap<String, String> map = new HashMap<>();
        map.put("id", String.valueOf(user.getUserId()));
        map.put("email", user.getEmail());
        map.put("username", user.getUsername());
        map.put("password", user.getPassword());
        user.addToUserList(map);
        System.out.println(user.returnUserList());
        return map;
    }
    
}
