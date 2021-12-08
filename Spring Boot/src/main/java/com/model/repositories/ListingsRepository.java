package com.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Listing;

public interface ListingsRepository extends JpaRepository<Listing, Long> {
    
}
