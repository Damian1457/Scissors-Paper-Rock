package com.example.tutoring.classes;

public class Plane {
    protected String model;

    public Plane(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "model='" + model + '\'' +
                '}';
    }
}
