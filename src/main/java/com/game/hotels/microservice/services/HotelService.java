package com.game.hotels.microservice.services;

import com.game.hotels.microservice.entities.Hotel;

import java.util.List;

public interface HotelService {
    Hotel saveHotel(Hotel hotel);
    Hotel getHotel(String id);
    List<Hotel> getAllHotels();
    Hotel updateHotel(Hotel hotel);
    Hotel deleteHotel(String id);
}
