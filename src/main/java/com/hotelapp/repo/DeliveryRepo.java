package com.hotelapp.repo;

import com.hotelapp.models.Delivery;
import com.hotelapp.models.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryRepo extends JpaRepository<Delivery, Integer> {

    // Derived Queries
    Delivery findByPartnerName(String partnerName);

}
