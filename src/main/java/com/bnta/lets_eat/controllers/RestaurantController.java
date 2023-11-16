package com.bnta.lets_eat.controllers;

import com.bnta.lets_eat.models.Restaurant;
import com.bnta.lets_eat.models.RestaurantDTO;
import com.bnta.lets_eat.repositories.RestaurantRepository;
import com.bnta.lets_eat.services.RestaurantService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("restaurants")
public class RestaurantController {

    @Autowired
    RestaurantService restaurantService;

//    INDEX
    @GetMapping
    public ResponseEntity<List<Restaurant>> getAllRestaurants(){
        return new ResponseEntity<>(restaurantService.getAllRestaurants(), HttpStatus.OK);
    }

//    SHOW
    @GetMapping("/{id}")
    public ResponseEntity<Restaurant> getRestaurant(@PathVariable Long id){
        return new ResponseEntity<>(restaurantService.getRestaurant(id), HttpStatus.FOUND);
    }


//    CREATE
    @PostMapping
    public ResponseEntity<Restaurant> createRestaurant(@RequestBody RestaurantDTO restaurantDTO){
        Restaurant newRestaurant = restaurantService.createNewRestaurant(restaurantDTO);
        return new ResponseEntity<>(newRestaurant, HttpStatus.CREATED);
    }


//    UPDATE
}
