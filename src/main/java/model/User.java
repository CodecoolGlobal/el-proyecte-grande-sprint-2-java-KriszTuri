package model;

import java.util.ArrayList;
import java.util.List;


public class User {
    private int userId;
    private String username;
    private String email;
    private String password;
    private List<User> userList = new ArrayList<>();

    public void addToUserList(User user){
        userList.add(user);
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
