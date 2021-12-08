package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Plant {
    @Id
    private Long plantId;
    private String name;
    
    
    public String getName() {
        return name;
    }
    public Long getPlantID() {
        return plantId;
    }
    public void setPlantID(Long plantId) {
        this.plantId = plantId;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}
