package com.example.junit_testing.shape.figures;

import com.example.junit_testing.shape.interfacee.Shape;

public class Rectangle implements Shape {
    private String shapeName;
    private double sideA;
    private double sideB;

    public Rectangle(String shapeName, double sideA, double sideB) {
        this.shapeName = shapeName;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getField() {
        double field = sideA * sideB;
        return field;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "shapeName='" + shapeName + '\'' +
                ", sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }
}
