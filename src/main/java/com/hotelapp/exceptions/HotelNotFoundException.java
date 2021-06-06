package com.hotelapp.exceptions;

public class HotelNotFoundException extends RuntimeException {

    public HotelNotFoundException() {

    }

    public HotelNotFoundException(String message) {
        super(message);
    }
}
