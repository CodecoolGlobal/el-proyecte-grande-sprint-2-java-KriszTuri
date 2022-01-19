package com.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String username;
    private String email;
    private String password;

    public User(){
    }

    public User(UserBuilder userBuilder){
        this.username = userBuilder.username;
        this.email = userBuilder.email;
        this.password = userBuilder.password;
    }
    
    
    public Long getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public static class UserBuilder{
        private String username;
        private String email;
        private String password;

        public UserBuilder username(String username){
            this.username = username;
            return this;
        }

        public UserBuilder email(String email){
            this.email = email;
            return this;
        }

        public UserBuilder password(String password){
            this.password = password;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }
}
