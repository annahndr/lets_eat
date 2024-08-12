package com.bnta.lets_eat.services;

import com.bnta.lets_eat.models.Cuisine;
import com.bnta.lets_eat.models.Location;
import com.bnta.lets_eat.models.Restaurant;
import com.bnta.lets_eat.models.RestaurantDTO;
import com.bnta.lets_eat.repositories.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {

    @Autowired
    RestaurantRepository restaurantRepository;

    @Autowired
    LocationService locationService;

    public List<Restaurant> getAllRestaurants(){
        return restaurantRepository.findAll();
    }

    public Restaurant getRestaurant(Long id){
        return restaurantRepository.findById(id).get();
    }

    public Restaurant createNewRestaurant(RestaurantDTO restaurantDTO){
        Location location = locationService.findLocation(restaurantDTO.getLocationId());
        Restaurant newRestaurant = new Restaurant(restaurantDTO.getName(), restaurantDTO.getAddress(), restaurantDTO.getPostcode(), restaurantDTO.getWebsite(), location, restaurantDTO.getLatitude(), restaurantDTO.getLongitude());

        for (String cuisine : restaurantDTO.getCuisines()){
            Cuisine enumCuisine = null;
            newRestaurant.getCuisines().add(enumCuisine.valueOf(cuisine));
        }
        return newRestaurant;
    }

    public List<Restaurant> findByCuisine(String cuisine){
        String upperCaseCuisine = cuisine.toUpperCase();
        Cuisine cuisineEnum = Cuisine.valueOf(upperCaseCuisine);
        return restaurantRepository.findRestaurantsByCuisinesContaining(cuisineEnum);
    }



}
