package com.dominikcebula.edu.design.patterns.creational.builder;

import com.dominikcebula.edu.design.patterns.creational.builder.travel.TravelAgency;
import com.dominikcebula.edu.design.patterns.creational.builder.travel.itinerary.BudgetTravelItineraryBuilder;
import com.dominikcebula.edu.design.patterns.creational.builder.travel.itinerary.DeluxeTravelItineraryBuilder;
import com.dominikcebula.edu.design.patterns.creational.builder.travel.itinerary.TravelItinerary;

public class Runner {
    public static void main(String[] args) {
        TravelAgency travelAgency = new TravelAgency();

        System.out.println("Deluxe Travel options...");
        var deluxeTravelItineraryBuilder = new DeluxeTravelItineraryBuilder();
        travelAgency.setTravelItineraryBuilder(deluxeTravelItineraryBuilder);

        travelAgency.createFullPackageItinerary("JFK", "LAX");
        TravelItinerary fullPackageDeluxeTravelItinerary = deluxeTravelItineraryBuilder.build();
        System.out.println("Full Package Deluxe Travel Itinerary: " + fullPackageDeluxeTravelItinerary);

        travelAgency.createFlightsOnlyItinerary("JFK", "LAX");
        TravelItinerary flightsOnlyDeluxeTravelItinerary = deluxeTravelItineraryBuilder.build();
        System.out.println("Flights Only Deluxe Travel Itinerary: " + flightsOnlyDeluxeTravelItinerary);

        travelAgency.createFlightsAndHotelItinerary("JFK", "LAX");
        TravelItinerary flightsAndHotelDeluxeItinerary = deluxeTravelItineraryBuilder.build();
        System.out.println("Flights and Hotel Deluxe Travel Itinerary: " + flightsAndHotelDeluxeItinerary);

        System.out.println("Budget Travel options...");
        var budgetTravelItineraryBuilder = new BudgetTravelItineraryBuilder();
        travelAgency.setTravelItineraryBuilder(budgetTravelItineraryBuilder);

        travelAgency.createFullPackageItinerary("JFK", "LAX");
        TravelItinerary fullPackageBudgetTravelItinerary = budgetTravelItineraryBuilder.build();
        System.out.println("Full Package Budget Travel Itinerary: " + fullPackageBudgetTravelItinerary);

        travelAgency.createFlightsOnlyItinerary("JFK", "LAX");
        TravelItinerary flightsOnlyBudgetTravelItinerary = budgetTravelItineraryBuilder.build();
        System.out.println("Flights Only Budget Travel Itinerary: " + flightsOnlyBudgetTravelItinerary);

        travelAgency.createFlightsAndHotelItinerary("JFK", "LAX");
        TravelItinerary flightsAndHotelBudgetItinerary = budgetTravelItineraryBuilder.build();
        System.out.println("Flights and Hotel Budget Travel Itinerary: " + flightsAndHotelBudgetItinerary);
    }
}
