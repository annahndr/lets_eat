package com.bnta.lets_eat.repositories;

import com.bnta.lets_eat.models.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
}
