package com.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Plant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long plantId;
    private String name;
    //NOTE: enum?
    private String careDifficulty;
    
    
    public Plant(){}

    public Plant(PlantBuilder plantBuilder){
        this.name = plantBuilder.name;
        this.careDifficulty = plantBuilder.careDifficulty; 
    }

    public String getName() {
        return name;
    }

    public Long getPlantID() {
        return plantId;
    }

    public static class PlantBuilder{
        private String name;
        private String careDifficulty;

        public PlantBuilder name(String name){
            this.name = name;
            return this;
        }

        public PlantBuilder careDifficulty(String careDifficulty){
            this.careDifficulty = careDifficulty;
            return this;
        }

        public Plant build(){
            return new Plant(this);
        }
    }
    
}
