package com.bnta.lets_eat.repositories;

import com.bnta.lets_eat.models.Cuisine;
import com.bnta.lets_eat.models.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

    List<Restaurant> findRestaurantsByCuisinesContaining(Cuisine cuisine);
}
