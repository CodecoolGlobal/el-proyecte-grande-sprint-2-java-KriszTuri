package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import com.model.Listing;
import com.model.repositories.ListingsRepository;

@Service
public class ListingService {
    private ListingsRepository listingsRepository;

    public List<Listing> getAllListings(){
        List<Listing> listings = new ArrayList<>();
        listingsRepository.findAll().forEach(listings::add);
        return listings;
    }

    public void addListing(Listing listing){
        listingsRepository.save(listing);
    }

    public Listing getListingById(Long id){
        return listingsRepository.getById(id);
    }

    public void updateListing(Long id, Listing updatedListing){
        listingsRepository.save(updatedListing);
    }

    public void deleteListingById(Long id){
        listingsRepository.deleteById(id);
    }
}
