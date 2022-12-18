package com.example.junit_testing.shape.figures;

import com.example.junit_testing.shape.interfacee.Shape;

public class Circle implements Shape {
    private String shapeName;
    private double radius;

    public Circle(String shapeName, double radius) {
        this.shapeName = shapeName;
        this.radius = radius;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getField() {
        double result = Math.PI * Math.pow(radius, 2);
        return result;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "shapeName='" + shapeName + '\'' +
                ", radius=" + radius +
                '}';
    }
}
