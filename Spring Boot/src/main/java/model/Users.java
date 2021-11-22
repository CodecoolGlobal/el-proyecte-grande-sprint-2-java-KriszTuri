package model;

import java.util.ArrayList;
import java.util.Map;


public class Users extends User {
    private ArrayList<Map> userList = new ArrayList<>();

    public void addToUserList(Map user){
        userList.add(user);
    }

    public ArrayList<Map> returnUserList(){
        return userList;
    }
}
