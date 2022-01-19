package com.model;

import java.util.List;

public class Lists {
    private List<User> users;
    private List<Plant> plants;
    private List<Listing> listings;

    public Lists(UserListBuilder userListBuilder){
        this.users = userListBuilder.users;
    }

    public Lists(PlantListBuilder plantListBuilder){
        this.plants = plantListBuilder.plants;
    }

    public Lists(ListingsListBuilder listingListBuilder){
        this.listings = listingListBuilder.listings;
    }
    
    public class UserListBuilder{
        private List<User> users;

        public void setUsers(List<User> users){
            this.users = users;
        }
    }

    public class PlantListBuilder {
        private List<Plant> plants;
    
        public void setPlants(List<Plant> plants){
            this.plants = plants;
        }
    }

    public class ListingsListBuilder {
        private List<Listing> listings;
    
        public void setListings(List<Listing> listings){
            this.listings = listings;
        }
    }
 
}
