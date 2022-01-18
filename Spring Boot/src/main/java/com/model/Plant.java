package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Plant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long plantId;
    private String name;
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
        private Long plantId;
        private String name;
        private String careDifficulty;

        public PlantBuilder plantId(Long plantId){
            this.plantId = plantId;
            return this;
        }

        public PlantBuilder name(String name){
            this.name = name;
            return this;
        }

        public PlantBuilder careDifficulty(String careDifficulty){
            this.careDifficulty = careDifficulty;
            return this;
        }
    }
    
}
