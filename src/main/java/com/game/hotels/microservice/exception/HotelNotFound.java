package com.game.hotels.microservice.exception;

import com.game.hotels.microservice.services.HotelService;

public class HotelNotFound extends RuntimeException {
    HotelNotFound(){
        super("Hotel not found");
    }
    public HotelNotFound(String id) {
        super("Hotel not found with ID: "+id);
    }
}
