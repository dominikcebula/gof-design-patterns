package com.dominikcebula.edu.design.patterns.creational.builder.travel.itinerary;

public interface TravelItineraryBuilder {
    TravelItineraryBuilder reset();

    TravelItineraryBuilder withFlight(String departure, String arrival);

    TravelItineraryBuilder withHotel(String hotelCity);

    TravelItineraryBuilder withTransportation();

    TravelItinerary build();
}
