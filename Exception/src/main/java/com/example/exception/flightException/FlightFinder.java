package com.example.exception.flightException;

import java.util.HashMap;
import java.util.Map;

public final class FlightFinder {
    public Boolean findFilght(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> theAirports = new HashMap<>();
        theAirports.put("Warsaw", true);
        theAirports.put("Vien", true);
        theAirports.put("Milan", false);
        theAirports.put("Saloniki", true);

        if (!theAirports.containsKey(flight.getArrivalAirport())) {
            throw new RouteNotFoundException();
        }
        if (!theAirports.containsKey(flight.getDepartureAirport())) {
            throw new RouteNotFoundException();
        }
        return theAirports.get(flight.getDepartureAirport()) && theAirports.get(flight.getArrivalAirport());
    }
}
