package com.hotelapp.service;

import com.hotelapp.models.Menu;

import java.util.List;

public interface MenuService {

    List<Menu> getMenusByHotel(String hotelName);



}
