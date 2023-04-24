package com.dominikcebula.edu.design.patterns.creational.builder.travel.components.flights;

public record Flight(FlightClass flightClass, String departure, String arrival) {
    public static Flight of(FlightClass flightClass, String departure, String arrival) {
        return new Flight(flightClass, departure, arrival);
    }
}
