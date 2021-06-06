package com.hotelapp.service;

import com.hotelapp.models.Menu;
import com.hotelapp.repo.MenuRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {

    MenuRepo menuRepo;

    @Autowired
    public MenuServiceImpl(MenuRepo menuRepo) {
        this.menuRepo = menuRepo;
    }
//*********************************************************************************


    @Override
    public List<Menu> getMenusByHotel(String hotelName) {
//        return menuRepo.findByHotelHotelName(hotelName);
        return menuRepo.findByHotel(hotelName);
    }
}


