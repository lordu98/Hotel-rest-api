package com.hotelapp.repo;

import com.hotelapp.models.Address;
import com.hotelapp.models.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepo extends JpaRepository<Address, Integer> {

}
