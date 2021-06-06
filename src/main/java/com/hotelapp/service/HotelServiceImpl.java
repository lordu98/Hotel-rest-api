package com.hotelapp.service;

import com.hotelapp.exceptions.HotelNotFoundException;
import com.hotelapp.exceptions.IdNotFoundException;
import com.hotelapp.models.Hotel;
import com.hotelapp.repo.HotelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.remoting.RemoteTimeoutException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {

    HotelRepo hotelRepo;

    @Autowired
    public HotelServiceImpl(HotelRepo hotelRepo) {
        this.hotelRepo = hotelRepo;
    }

    //********************************************************************************
    @Override
    public Hotel addHotel(Hotel hotel) {
        return hotelRepo.save(hotel);
    }

    @Override
    public void updateHotel(Hotel hotel) {
        hotelRepo.save(hotel);
    }

    @Override
    public Hotel getHotelById(int hotelId) {
        return hotelRepo
                .findById(hotelId)
                .orElseThrow(() -> new IdNotFoundException("Id not found"));

    }

    @Override
    public void deleteHotel(int hotelId) {
        if (hotelId<=0){
            throw new RuntimeException("Id should be greater than zero");
        }
        hotelRepo.deleteById(hotelId);
    }

    @Override
    public List<Hotel> getHotelsByCity(String city) {
        List<Hotel> hotelList = hotelRepo.findByAddressCity(city);
        if (hotelList.isEmpty()) {
            throw new HotelNotFoundException("Hotel with this city not found");
        }
        return hotelList;
    }

    @Override
    public List<Hotel> getHotelsByMenu(String menuName) {
        List<Hotel> hotelList = hotelRepo.getHotelsByMenu(menuName);
        if (hotelList.isEmpty()) {
            throw new HotelNotFoundException("Hotel with this menu not found");
        }
        return hotelList;
    }

    @Override
    public List<Hotel> getHotelsByDelivery(String partnerName) {
        List<Hotel> hotelList =  hotelRepo.getHotelsByDelivery(partnerName);
        if (hotelList.isEmpty()) {
            throw new HotelNotFoundException("Hotel with this delivery not found");
        }
        return hotelList;
    }

    @Override
    public List<Hotel> getHotelsByLocation(String location) {
        List<Hotel> hotelList = hotelRepo.findByAddressStreetName(location);
        if (hotelList.isEmpty()) {
            throw new HotelNotFoundException("Hotel with this location not found");
        }
        return hotelList;
    }

    @Override
    public List<Hotel> getHotelsByLocationAndMenu(String location, String menuName) {
        List<Hotel> hotelList = hotelRepo.getHotelsByLocationAndMenu(location, menuName);
        if (hotelList.isEmpty()) {
            throw new HotelNotFoundException("Hotel with this location and menu not found");
        }
        return hotelList;

    }
}
