package service;

import org.springframework.stereotype.Component;

@Component
public class UserRegister {
    public UserRegister() {
        System.out.println("UR created!");
    }

    public boolean addUser(){
        return true;
    }
}
