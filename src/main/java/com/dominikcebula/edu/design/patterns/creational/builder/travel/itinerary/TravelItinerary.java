package com.dominikcebula.edu.design.patterns.creational.builder.travel.itinerary;

import com.dominikcebula.edu.design.patterns.creational.builder.travel.components.flights.Flight;
import com.dominikcebula.edu.design.patterns.creational.builder.travel.components.hotels.Hotel;
import com.dominikcebula.edu.design.patterns.creational.builder.travel.components.transportation.CarTransportation;

public class TravelItinerary {
    private Flight flight;
    private Hotel hotel;
    private CarTransportation transportation;

    TravelItinerary() {
    }

    public Flight getFlight() {
        return flight;
    }

    void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Hotel getHotel() {
        return hotel;
    }

    void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public CarTransportation getTransportation() {
        return transportation;
    }

    void setTransportation(CarTransportation transportation) {
        this.transportation = transportation;
    }

    @Override
    public String toString() {
        return "TravelItinerary{" +
                (flight != null ? " flight=" + flight : "") +
                (hotel != null ? " hotel=" + hotel : "") +
                (transportation != null ? " transportation=" + transportation : "") +
                " }";
    }
}
