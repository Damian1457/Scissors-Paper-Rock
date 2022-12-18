package com.example.tutoring.classes;

public class PassengerPlane extends Plane {
    private int numberOfSeats;
    private boolean hasFirstClass;

    public PassengerPlane(String model, int numberOfSeats, boolean hasFirstClass) {
        super(model);
        this.numberOfSeats = numberOfSeats;
        this.hasFirstClass = hasFirstClass;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public boolean isHasFirstClass() {
        return hasFirstClass;
    }

    public void setHasFirstClass(boolean hasFirstClass) {
        this.hasFirstClass = hasFirstClass;
    }

    @Override
    public String toString() {
        return "PassengerPlane model: " + model + "\nNumber of seats: " + numberOfSeats + "\nFirst class: " + (hasFirstClass ? "Available" : "Not available");
    }
}
