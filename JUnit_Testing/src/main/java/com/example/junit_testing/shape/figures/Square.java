package com.example.junit_testing.shape.figures;

import com.example.junit_testing.shape.interfacee.Shape;

public class Square implements Shape {
    private String shapeName;
    private double side;

    public Square(String shapeName, double side) {
        this.shapeName = shapeName;
        this.side = side;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getField() {
        double result = Math.pow(side, 2);
        return result;
    }

    @Override
    public String toString() {
        return "Square{" +
                "shapeName='" + shapeName + '\'' +
                ", side=" + side +
                '}';
    }
}
