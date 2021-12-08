package com.model.repositories;

import com.model.Plant;

import org.springframework.data.jpa.repository.JpaRepository;


public interface PlantRepository extends JpaRepository<Plant, Long> {
    
}
