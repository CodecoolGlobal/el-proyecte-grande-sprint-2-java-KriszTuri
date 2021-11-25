package model;

public abstract class Listing {
    private int id;
    private int userId;
    private Plant plant;
    private String listingTime;


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public int getUserId() {
        return userId;
    }


    public void setUserId(int userId) {
        this.userId = userId;
    }


    public Plant getPlant() {
        return plant;
    }


    public void setPlant(Plant plant) {
        this.plant = plant;
    }


    public String getListingTime() {
        return listingTime;
    }


    public void setListingTime(String listingTime) {
        this.listingTime = listingTime;
    }

}
