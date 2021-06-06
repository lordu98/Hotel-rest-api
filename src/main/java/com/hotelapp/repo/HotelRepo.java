package com.hotelapp.repo;

import com.hotelapp.models.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotelRepo extends JpaRepository<Hotel, Integer> {

    List<Hotel> findByAddressCity(String city);
    List<Hotel> findByAddressStreetName(String location);


    @Query("from Hotel h inner join h.menuList mn where mn.menuName=?1")
    List<Hotel> getHotelsByMenu(String menuName);

    @Query("from Hotel h inner join h.delivery d where d.partnerName=?1")
    List<Hotel> getHotelsByDelivery(String partnerName);

    @Query("from Hotel h inner join h.address a inner join h.menuList mn where a.streetName=?1 and mn.menuName=?2")
    List<Hotel> getHotelsByLocationAndMenu(String location, String menuName);

}
