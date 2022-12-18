package com.example.tutoring.classes;

public class MilitaryPlane extends Plane {
    private int numberOfBombs;
    private double carryWeight;
    private boolean isBomber;

    public MilitaryPlane(String model, int numberOfBombs, double carryWeight, boolean isBomber) {
        super(model);
        this.carryWeight = carryWeight;
        this.isBomber = isBomber;
        if (isBomber) {
            this.numberOfBombs = numberOfBombs;
        } else {
            this.numberOfBombs = 0;
        }
    }

    public void setNumberOfBombs(int numberOfBombs) {
        if (isBomber) {
            this.numberOfBombs = numberOfBombs;
        } else {
            System.out.println("Can't add it up, it's not a bomber");
        }
    }

    public void setCarryWeight(double carryWeight) {
        this.carryWeight = carryWeight;
    }

    public int getNumberOfBombs() {
        return numberOfBombs;
    }

    public double getCarryWeight() {
        return carryWeight;
    }

    public boolean isBomber() {
        return isBomber;
    }

    @Override
    public String toString() {
        if (isBomber) {
            return "MilitaryPlane model: " + model + "\nCarry weight: " + carryWeight + "\nCarrying " + numberOfBombs + " bombs.";
        } else {
            return "MilitaryPlane model: " + model + "\nCarry weight: " + carryWeight;
        }
    }

}
