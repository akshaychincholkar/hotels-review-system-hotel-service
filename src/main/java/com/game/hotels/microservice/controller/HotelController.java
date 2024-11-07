package com.game.hotels.microservice.controller;

import com.game.hotels.microservice.entities.Hotel;
import com.game.hotels.microservice.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {
    @Autowired
    private HotelService hotelService;

    @PostMapping
    public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel){
        return ResponseEntity.status(HttpStatus.CREATED).body(hotelService.saveHotel(hotel));
    }

    @GetMapping("/{hotel_id}")
    public ResponseEntity<Hotel> getHotel(@PathVariable ("hotel_id") String hotelId){
        return ResponseEntity.status(HttpStatus.FOUND).body(hotelService.getHotel(hotelId));
    }

    @GetMapping
    public ResponseEntity<List<Hotel>> getAllHotels(){
        return ResponseEntity.status(HttpStatus.OK).body(hotelService.getAllHotels());
    }

    @PutMapping
    public ResponseEntity<Hotel> updateHotel(@RequestBody Hotel hotel){
        return ResponseEntity.status(HttpStatus.OK).body(hotelService.updateHotel(hotel));
    }

    @DeleteMapping("/{hotelId}")
    public ResponseEntity<Hotel> deleteHotel(@PathVariable String hotelId){
        return ResponseEntity.status(HttpStatus.OK).body(hotelService.deleteHotel(hotelId));
    }
}
