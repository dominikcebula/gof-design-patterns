package com.dominikcebula.edu.design.patterns.creational.builder.travel;

import com.dominikcebula.edu.design.patterns.creational.builder.travel.itinerary.TravelItineraryBuilder;

public class TravelAgency {
    private TravelItineraryBuilder travelItineraryBuilder;

    public void setTravelItineraryBuilder(TravelItineraryBuilder travelItineraryBuilder) {
        this.travelItineraryBuilder = travelItineraryBuilder;
    }

    public void createFlightsOnlyItinerary(String departure, String arrival) {
        travelItineraryBuilder
                .reset()
                .withFlight(departure, arrival);
    }

    public void createFlightsAndHotelItinerary(String departure, String arrival) {
        travelItineraryBuilder
                .reset()
                .withFlight(departure, arrival)
                .withHotel(arrival);
    }

    public void createFullPackageItinerary(String departure, String arrival) {
        travelItineraryBuilder
                .reset()
                .withFlight(departure, arrival)
                .withHotel(arrival)
                .withTransportation();
    }
}
