package com.dominikcebula.edu.design.patterns.creational.builder.travel.itinerary;

import com.dominikcebula.edu.design.patterns.creational.builder.travel.components.flights.Flight;
import com.dominikcebula.edu.design.patterns.creational.builder.travel.components.hotels.Hotel;
import com.dominikcebula.edu.design.patterns.creational.builder.travel.components.transportation.CarTransportation;

import static com.dominikcebula.edu.design.patterns.creational.builder.travel.components.flights.FlightClass.ECONOMY;
import static com.dominikcebula.edu.design.patterns.creational.builder.travel.components.hotels.HotelRating.TOURIST;
import static com.dominikcebula.edu.design.patterns.creational.builder.travel.components.transportation.CarType.SMALL;
import static com.dominikcebula.edu.design.patterns.creational.builder.travel.components.transportation.TransmissionType.MANUAL;

public class BudgetTravelItineraryBuilder implements TravelItineraryBuilder {
    private TravelItinerary travelItinerary = new TravelItinerary();

    @Override
    public TravelItineraryBuilder reset() {
        travelItinerary = new TravelItinerary();
        return this;
    }

    @Override
    public TravelItineraryBuilder withFlight(String departure, String arrival) {
        travelItinerary.setFlight(Flight.of(ECONOMY, departure, arrival));
        return this;
    }

    @Override
    public TravelItineraryBuilder withHotel(String hotelCity) {
        travelItinerary.setHotel(Hotel.of(TOURIST, hotelCity));
        return this;
    }

    @Override
    public TravelItineraryBuilder withTransportation() {
        travelItinerary.setTransportation(new CarTransportation(SMALL, MANUAL));
        return this;
    }

    @Override
    public TravelItinerary build() {
        return travelItinerary;
    }
}
