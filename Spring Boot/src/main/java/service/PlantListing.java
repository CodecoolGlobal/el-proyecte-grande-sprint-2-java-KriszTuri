package service;

import org.springframework.stereotype.Component;

@Component
public class PlantListing {
    public PlantListing() {
        System.out.println("PlantListing created!");
    }

    public boolean addListing(){
        System.out.println("Method called!");
        return true;
    }
}
