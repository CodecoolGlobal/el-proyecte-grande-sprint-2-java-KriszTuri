package com.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Listing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private Long plantId;
    private final String listingTime = setListingTime();

    public Listing(){}

    public Listing(ListingBuilder listingBuilder){
        this.userId = listingBuilder.userId;
        this.plantId = listingBuilder.plantId;
    }

    public String setListingTime(){
        PostingDate postingDate = new PostingDate();
        return postingDate.getFormattedDate();
    }

    public Long getId() {
        return id;
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

        public ListingBuilder userId(Long userId){
            this.userId = userId;
            return this;
        }

        public ListingBuilder plantId(Long plantId){
            this.plantId = plantId;
            return this;
        }

        public Listing build(){
            return new Listing(this);
        }
    }

}
