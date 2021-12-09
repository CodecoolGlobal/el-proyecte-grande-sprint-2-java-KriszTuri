package com.controller;

import com.service.PlantService;

import java.util.List;

import com.model.Plant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlantController {
    PlantService plantService;

    @Autowired
    public PlantController(PlantService plantService){
        this.plantService = plantService;
    }

    @GetMapping("/plants")
    public List<Plant> getAllPlants(){
        return plantService.getAllPlants();
    }
}
