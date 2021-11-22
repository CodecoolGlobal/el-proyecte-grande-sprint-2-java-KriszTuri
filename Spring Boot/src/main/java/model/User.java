package model;

import java.util.ArrayList;
import java.util.List;


public class User extends Users {
    private ArrayList<User> userList = new ArrayList<>();

    public void addToUserList(User user){
        userList.add(user);
    }

    public ArrayList<User> returnUserList(){
        return userList;
    }
}
