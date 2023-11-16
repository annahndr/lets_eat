package com.bnta.lets_eat.controllers;

import com.bnta.lets_eat.models.Location;
import com.bnta.lets_eat.services.LocationService;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("locations")
public class LocationController {

    @Autowired
    LocationService locationService;

    @GetMapping
    public ResponseEntity<List<Location>> getAllLocations(){
        return new ResponseEntity<>(locationService.getAllLocations(), HttpStatus.FOUND);
    }
}
