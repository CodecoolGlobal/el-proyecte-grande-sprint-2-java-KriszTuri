package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.model.Plant;
import com.model.User;

@Entity
public abstract class Listing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private Long plantId;
    private String listingTime;

    public Listing(){}

    public Listing(ListingBuilder listingBuilder){
        this.userId = listingBuilder.userId;
        this.plantId = listingBuilder.plantId;
        this.listingTime = listingBuilder.listingTime;
    }

    public Long getId() {
        return id;
    }

    public String getListingTime() {
        return listingTime;
    }

    public Long getUserId() {
        return userId;
    }

    public Long getPlantId() {
        return plantId;
    }

    public static class ListingBuilder{
        private Long userId;
        private Long plantId;
        private String listingTime;

        public ListingBuilder userId(Long userId){
            this.userId = userId;
            return this;
        }

        public ListingBuilder plantId(Long plantId){
            this.plantId = plantId;
            return this;
        }

        public ListingBuilder listingTime(String listingTime){
            this.listingTime = listingTime;
            return this;
        }
    }

}
