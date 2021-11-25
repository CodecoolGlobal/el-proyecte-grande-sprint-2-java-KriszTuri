package controller;

import model.User;
import model.UsersList;
import model.Listing;
import model.LisingsList;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;



@RestController
public class RouteController {
    UsersList user = new UsersList();
    LisingsList listing = new LisingsList();
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

    public User testListing(){
        listing.setId(index);
        listing.setUserId(user.getUserId());
        index++;
        return user;
    }

    @GetMapping("/test")
    @CrossOrigin
    public ArrayList<Map<String, String>> saveUser() {
        testUser();
        LinkedHashMap<String, String> users = new LinkedHashMap<String, String>(); //Linked HashMaps: the data is stored in the order we declared
        users.put("id", String.valueOf(user.getUserId()));
        users.put("email", user.getEmail());
        users.put("username", user.getUsername());
        users.put("password", user.getPassword());
        user.addToUserList(users);
        System.out.println(user.returnUserList());
        return user.returnUserList();
    }

    @GetMapping("/listings")
    @CrossOrigin
    public ArrayList<Map<String, String>> getListings() {
        LinkedHashMap<String, String> listings = new LinkedHashMap<String, String>();
        return null;
    }
    
}
