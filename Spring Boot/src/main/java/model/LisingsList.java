package model;

import java.util.ArrayList;
import java.util.Map;

public class LisingsList extends Listing {
    private ArrayList<Map<String, String>> listings = new ArrayList<>();

    public void addToUserList(Map<String, String> listing){
        listings.add(listing);
    }

    public ArrayList<Map<String, String>> returnListingsList(){
        return listings;
    }
}
