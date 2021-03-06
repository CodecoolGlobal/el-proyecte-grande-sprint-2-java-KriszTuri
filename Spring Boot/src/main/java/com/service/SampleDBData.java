package com.service;

import com.configuration.PasswordEncoderClass;
import com.model.Listing;
import com.model.Plant;
import com.model.User;
import com.model.repositories.ListingRepository;
import com.model.repositories.PlantRepository;
import com.model.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SampleDBData {
    private final UserRepository userRepository;
    private final PlantRepository plantRepository;
    private final ListingRepository listingRepository;
    private final PasswordEncoderClass passwordEncoder;

    @Autowired
    public SampleDBData(UserRepository userRepository, PlantRepository plantRepository, ListingRepository listingRepository, PasswordEncoderClass passwordEncoder){
        this.userRepository = userRepository;
        this.plantRepository = plantRepository;
        this.listingRepository = listingRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public void createSampleData(){
        User user1 = new User.UserBuilder().username("user1").email("user1@mail.com").password(passwordEncoder.getPasswordEncoder().encode("pass123")).roles("ROLE_USER").isActive(true).build();
        User user2 = new User.UserBuilder().username("user2").email("user2@mail.com").password(passwordEncoder.getPasswordEncoder().encode("pass345")).roles("ROLE_USER, ROLE_ADMIN").isActive(true).build();
        user1 = userRepository.saveAndFlush(user1);
        user2 = userRepository.saveAndFlush(user2);

        Plant plant1 = new Plant.PlantBuilder().name("snake plant").careDifficulty("easy").build();
        Plant plant2 = new Plant.PlantBuilder().name("ZZ plant").careDifficulty("easy").build();
        plant1 = plantRepository.saveAndFlush(plant1);
        plant2 = plantRepository.saveAndFlush(plant2);

        Listing listing1 = new Listing.ListingBuilder().userId(user1.getUserId()).plantId(plant1.getPlantID()).build();
        Listing listing2 = new Listing.ListingBuilder().userId(user2.getUserId()).plantId(plant2.getPlantID()).build();
        listing1 = listingRepository.saveAndFlush(listing1);
        listing2 = listingRepository.saveAndFlush(listing2);
    }
}
