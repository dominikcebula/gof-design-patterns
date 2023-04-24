package com.dominikcebula.edu.design.patterns.creational.builder.travel;

import com.dominikcebula.edu.design.patterns.creational.builder.travel.itinerary.TravelItinerary;
import com.dominikcebula.edu.design.patterns.creational.builder.travel.itinerary.TravelItineraryBuilder;

public class TravelAgency {
    private final TravelItineraryBuilder travelItineraryBuilder;

    public TravelAgency(TravelItineraryBuilder travelItineraryBuilder) {
        this.travelItineraryBuilder = travelItineraryBuilder;
    }

    public TravelItinerary createFlightsOnlyItinerary(String departure, String arrival) {
        return travelItineraryBuilder
                .reset()
                .withFlight(departure, arrival)
                .build();
    }

    public TravelItinerary createFlightsAndHotelItinerary(String departure, String arrival) {
        return travelItineraryBuilder
                .reset()
                .withFlight(departure, arrival)
                .withHotel(arrival)
                .build();
    }

    public TravelItinerary createFullPackageItinerary(String departure, String arrival) {
        return travelItineraryBuilder
                .reset()
                .withFlight(departure, arrival)
                .withHotel(arrival)
                .withTransportation()
                .build();
    }
}
