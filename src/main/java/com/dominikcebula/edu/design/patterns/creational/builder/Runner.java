package com.dominikcebula.edu.design.patterns.creational.builder;

import com.dominikcebula.edu.design.patterns.creational.builder.travel.TravelAgency;
import com.dominikcebula.edu.design.patterns.creational.builder.travel.itinerary.BudgetTravelItineraryBuilder;
import com.dominikcebula.edu.design.patterns.creational.builder.travel.itinerary.DeluxeTravelItineraryBuilder;
import com.dominikcebula.edu.design.patterns.creational.builder.travel.itinerary.TravelItinerary;

public class Runner {
    public static void main(String[] args) {
        TravelAgency travelAgency = new TravelAgency(new DeluxeTravelItineraryBuilder());

        System.out.println("Deluxe Travel options...");

        TravelItinerary fullPackageDeluxeTravelItinerary = travelAgency.createFullPackageItinerary("JFK", "LAX");
        System.out.println("Full Package Deluxe Travel Itinerary: " + fullPackageDeluxeTravelItinerary);

        TravelItinerary flightsOnlyDeluxeTravelItinerary = travelAgency.createFlightsOnlyItinerary("JFK", "LAX");
        System.out.println("Flights Only Deluxe Travel Itinerary: " + flightsOnlyDeluxeTravelItinerary);

        TravelItinerary flightsAndHotelDeluxeItinerary = travelAgency.createFlightsAndHotelItinerary("JFK", "LAX");
        System.out.println("Flights and Hotel Deluxe Travel Itinerary: " + flightsAndHotelDeluxeItinerary);


        travelAgency = new TravelAgency(new BudgetTravelItineraryBuilder());
        System.out.println("Budget Travel options...");

        TravelItinerary fullPackageBudgetTravelItinerary = travelAgency.createFullPackageItinerary("JFK", "LAX");
        System.out.println("Full Package Budget Travel Itinerary: " + fullPackageBudgetTravelItinerary);

        TravelItinerary flightsOnlyBudgetTravelItinerary = travelAgency.createFlightsOnlyItinerary("JFK", "LAX");
        System.out.println("Flights Only Budget Travel Itinerary: " + flightsOnlyBudgetTravelItinerary);

        TravelItinerary flightsAndHotelBudgetItinerary = travelAgency.createFlightsAndHotelItinerary("JFK", "LAX");
        System.out.println("Flights and Hotel Budget Travel Itinerary: " + flightsAndHotelBudgetItinerary);
    }
}
