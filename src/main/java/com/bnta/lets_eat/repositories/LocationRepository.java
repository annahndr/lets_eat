package com.bnta.lets_eat.repositories;

import com.bnta.lets_eat.models.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {
}
