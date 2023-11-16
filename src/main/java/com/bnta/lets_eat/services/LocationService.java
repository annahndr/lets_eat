package com.bnta.lets_eat.services;

import com.bnta.lets_eat.models.Location;
import com.bnta.lets_eat.repositories.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService {

    @Autowired
    LocationRepository locationRepository;

    public Location findLocation(Long locationId){
        return locationRepository.findById(locationId).get();
    }

    public List<Location> getAllLocations(){
        return locationRepository.findAll();
    }
}
