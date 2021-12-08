package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import com.model.Plant;
import com.model.User;

@Entity
public abstract class Listing {
    @Id
    private Long id;
    private Long userId;
    private Long plantId;
    private String listingTime;


    public Long getId() {
        return id;
    }


    public void setId (Long id) {
        this.id = id;
    }


    public String getListingTime() {
        return listingTime;
    }


    public void setListingTime(String listingTime) {
        this.listingTime = listingTime;
    }


    public Long getUserId() {
        return userId;
    }


    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getPlantId() {
        return plantId;
    }

    public void setPlantId(Long plantId) {
        this.plantId = plantId;
    }

}
