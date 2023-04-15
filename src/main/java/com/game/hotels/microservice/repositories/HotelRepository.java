package com.game.hotels.microservice.repositories;

import com.game.hotels.microservice.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel,String> {
}
