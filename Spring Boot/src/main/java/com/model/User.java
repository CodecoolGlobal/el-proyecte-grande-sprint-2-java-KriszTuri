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
    private String roles;
    private boolean isActive;

    public User(){
    }

    public User(UserBuilder userBuilder){
        this.username = userBuilder.username;
        this.email = userBuilder.email;
        this.password = userBuilder.password;
        this.roles = userBuilder.roles;
        this.isActive = userBuilder.isActive;
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

    public String getRoles(){
        return roles;
    }

    public boolean isActive(){
        return isActive;
    }

    public static class UserBuilder{
        private String username;
        private String email;
        private String password;
        private String roles;
        private boolean isActive;

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

        public UserBuilder roles(String roles){
            this.roles = roles;
            return this;
        }

        public UserBuilder isActive(boolean isActive){
            this.isActive = isActive;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }
}
