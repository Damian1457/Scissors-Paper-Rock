package com.example.junit_testing.shape.application;

import com.example.junit_testing.shape.interfacee.Shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private Shape shape;
    private List<Shape> theShapes = new ArrayList<>();

    public Shape addFigure(Shape shape) {
       theShapes.add(shape);
        return shape;
    }

    public boolean removeFigure(Shape shape) {
        theShapes.remove(shape);
        return true;
    }

    public Shape getFigure(int n) {
        return theShapes.get(n);
    }

    public List<Shape> showFigures() {
        return theShapes;
    }
}
