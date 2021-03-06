package com.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Listing;

@Repository
public interface ListingRepository extends JpaRepository<Listing, Long> {
    
}
