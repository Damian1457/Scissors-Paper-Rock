package com.example.tutoring.classes;

import java.util.ArrayList;
import java.util.List;

public class PlanesList {
    private List<PassengerPlane> passengerPlanes;
    private List<MilitaryPlane> militaryPlanes;

    public PlanesList() {
        passengerPlanes = new ArrayList<>();
        passengerPlanes.add(new PassengerPlane("Boeing", 230, true));
        passengerPlanes.add(new PassengerPlane("Boeing", 100, true));
        passengerPlanes.add(new PassengerPlane("Boeing", 300, true));
        passengerPlanes.add(new PassengerPlane("Boeing", 300, false));
        passengerPlanes.add(new PassengerPlane("Boeing", 150, false));

        militaryPlanes = new ArrayList<>();
        militaryPlanes.add(new MilitaryPlane("F30", 200, 1900.00, true));
        militaryPlanes.add(new MilitaryPlane("F30", 200, 1900.00, true));
        militaryPlanes.add(new MilitaryPlane("F30", 200, 1900.00, false));
        militaryPlanes.add(new MilitaryPlane("F30", 200, 1900.00, true));
        militaryPlanes.add(new MilitaryPlane("F30", 200, 1900.00, false));
    }

    public List<PassengerPlane> getPassengerPlanes() {
        return passengerPlanes;
    }

    public List<MilitaryPlane> getMilitaryPlanes() {
        return militaryPlanes;
    }

    @Override
    public String toString() {
        return "PlanesList{" +
                "passengerPlanes=" + passengerPlanes +
                ", militaryPlanes=" + militaryPlanes +
                '}';
    }
}
