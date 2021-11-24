package model;

import java.util.ArrayList;
import java.util.Map;


public class Users extends User {
    private ArrayList<Map<String, String>> userList = new ArrayList<>();

    public void addToUserList(Map<String, String> user){
        userList.add(user);
    }

    public ArrayList<Map<String, String>> returnUserList(){
        return userList;
    }
}
