package com.example.exception.flightException;

public class FlightApplication {
    public static void main(String[] args) {
        Flight flight = new Flight("Warsaw", "Stokholm");
        FlightFinder flightFinder = new FlightFinder();
        try {
            flightFinder.findFilght(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("There is no such flight " + e);
        }
    }

}
