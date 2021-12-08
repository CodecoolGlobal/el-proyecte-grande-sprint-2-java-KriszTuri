package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import com.model.Plant;
import com.model.repositories.PlantRepository;

@Service
public class PlantService {
    @Autowired
    private PlantRepository plantRepository;
        
    public List<Plant> getAllPlants(){
        List<Plant> plants = new ArrayList<>();
        plantRepository.findAll().forEach(plants::add);
        return plants;
    }

    public void addPlant(Plant plant){
        plantRepository.save(plant);
    }

    public Plant getPlantById(Long id){
        return plantRepository.findById(id).get();
    }

    public void updatePlantById(Long id, Plant updatedPlant){
        plantRepository.save(updatedPlant);
    }

    public void deletePlantById(Long id){
        plantRepository.deleteById(id);
    }
}
