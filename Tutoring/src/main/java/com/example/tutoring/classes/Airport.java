package com.example.tutoring.classes;

import java.util.ArrayList;
import java.util.List;

public class Airport {
    private String name;
    private int numberOfMilitaryPlanes;
    private int numberOfPassengerPlanes;
    private List<Plane> thePlaneList;

    public Airport(String name) {
        this.thePlaneList = new ArrayList<>();
        this.name = name;
        this.numberOfMilitaryPlanes = 0;
        this.numberOfPassengerPlanes = 0;
    }

    public Airport(String name, List<Plane> thePlaneList) {
        this.thePlaneList = thePlaneList;
        this.name = name;
        this.numberOfMilitaryPlanes = 0;
        this.numberOfPassengerPlanes = 0;

        for (Plane plane : this.thePlaneList) {
            if (plane.getClass().getName().equals("MilitaryPlane")) {
                numberOfMilitaryPlanes++;
            } else if (plane.getClass().getName().equals("PassengerPlane")) {
                numberOfPassengerPlanes++;
            }
        }
    }

    public List<Plane> getThePlaneList() {
        return thePlaneList;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfMilitaryPlanes() {
        return numberOfMilitaryPlanes;
    }

    public int getNumberOfPassengerPlanes() {
        return numberOfPassengerPlanes;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Airport{" + "name='" + name + '\'' + ", numberOfMilitaryPlanes=" + numberOfMilitaryPlanes + ", numberOfPassengerPlanes=" + numberOfPassengerPlanes + ", thePlaneList=" + thePlaneList + '}';
    }

    public boolean addPlanes(PlanesList planesList, Plane plane) {
        if (plane.getClass().getName().equals("MilitaryPlane")) {
            numberOfMilitaryPlanes++;
        } else if (plane.getClass().getName().equals("PassengerPlane")) {
            numberOfPassengerPlanes++;
        }
        return thePlaneList.add(plane);
    }

    public List<String> playnsDisplay() {
        List<String> theAllPlanes = new ArrayList<>();
        for (Plane theList : thePlaneList) {
            theAllPlanes.add(theList.toString());
        }
        return theAllPlanes;
    }
}

//