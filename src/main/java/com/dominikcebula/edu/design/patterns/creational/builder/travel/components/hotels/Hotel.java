package com.dominikcebula.edu.design.patterns.creational.builder.travel.components.hotels;

public record Hotel(HotelRating rating, String name) {
    public static Hotel of(HotelRating rating, String name) {
        return new Hotel(rating, name);
    }
}
