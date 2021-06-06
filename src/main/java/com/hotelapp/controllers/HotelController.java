package com.hotelapp.controllers;

import com.hotelapp.models.Hotel;
import com.hotelapp.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HotelController {
    HotelService hotelService;

    @Autowired
    public HotelController(HotelService hotelService) {
        this.hotelService = hotelService;
    }

//    ***********************API*****************************

   @PostMapping("/hotels")
    public ResponseEntity<Hotel> addHotel(@RequestBody Hotel hotel) {
        System.out.println(hotel);
        Hotel newHotel = hotelService.addHotel(hotel);
        System.out.println(newHotel);
        HttpHeaders header = new HttpHeaders();
        header.add("desc", "one hotel added");
        return ResponseEntity.ok().headers(header).body(newHotel);
    }

    @PutMapping("/hotels")
    public ResponseEntity<String> updateHotel(@RequestBody Hotel hotel) {
        hotelService.updateHotel(hotel);
        return ResponseEntity.ok("updated");
    }

    @GetMapping("/hotels/hotel-by-id/{hotelId}")
    public ResponseEntity<Hotel> getHotelById(@PathVariable Integer hotelId) {
        Hotel newHotel = hotelService.getHotelById(hotelId);
        System.out.println(newHotel);
        HttpHeaders header = new HttpHeaders();
        header.add("desc", "getting one hotel instance");
        return ResponseEntity.ok().headers(header).body(newHotel);
    }

    @DeleteMapping("/hotels/hotel-by-id/{hotelId}")
    public ResponseEntity<Void> deleteHotel(@PathVariable int hotelId) {
        hotelService.deleteHotel(hotelId);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/hotels/hotels-by-city/{cityName}")
    public ResponseEntity<List<Hotel>> getHotelsByCity(@PathVariable("cityName") String city) {
        List<Hotel> hotelList = hotelService.getHotelsByCity(city);
        return ResponseEntity.ok().body(hotelList);
    }

    @GetMapping("/hotels/hotels-by-menu/{menuName}")
    public ResponseEntity<List<Hotel>> getHotelsByMenu(@PathVariable String menuName) {
        List<Hotel> hotelList = hotelService.getHotelsByMenu(menuName);
        return ResponseEntity.ok().body(hotelList);
    }

    @GetMapping("/hotels/hotels-by-delivery/{partnerName}")
    public ResponseEntity<List<Hotel>> getHotelsByDelivery(@PathVariable String partnerName) {
        List<Hotel> hotelList = hotelService.getHotelsByDelivery(partnerName);
        return ResponseEntity.ok().body(hotelList);
    }

    @GetMapping("/hotels/hotels-by-location/{location}")
    public ResponseEntity<List<Hotel>> getHotelsByLocation(@PathVariable String location) {
        List<Hotel> hotelList = hotelService.getHotelsByLocation(location);
        return ResponseEntity.ok().body(hotelList);
    }

    @GetMapping("/hotels/hotels-by-location/{location}/menuName/{menuName}")
    public ResponseEntity<List<Hotel>> getHotelsByLocationAndMenu(@PathVariable String location,
                                                                  @PathVariable String menuName) {
        List<Hotel> hotelList = hotelService.getHotelsByMenu(menuName);
        return ResponseEntity.ok().body(hotelList);
    }


}
