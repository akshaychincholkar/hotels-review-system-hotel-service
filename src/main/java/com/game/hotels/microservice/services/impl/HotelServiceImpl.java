package com.game.hotels.microservice.services.impl;

import com.game.hotels.microservice.entities.Hotel;
import com.game.hotels.microservice.exception.HotelNotFound;
import com.game.hotels.microservice.repositories.HotelRepository;
import com.game.hotels.microservice.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {
    @Autowired
    HotelRepository hotelRepository;

    @Override
    public Hotel saveHotel(Hotel hotel) {
        String uid = UUID.randomUUID().toString();
        hotel.setHotelId(uid);
        return hotelRepository.save(hotel);
    }
    @Override
    public Hotel getHotel(String id) {
        Hotel hotel = hotelRepository.findById(id).orElseThrow(()->new HotelNotFound(id));
        return hotel;
    }

    @Override
    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel updateHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    @Override
    public Hotel deleteHotel(String id) {
        Hotel hotel = hotelRepository.findById(id).orElseThrow(()->new HotelNotFound(id));
        hotelRepository.deleteById(id);
        return hotel;
    }
}
