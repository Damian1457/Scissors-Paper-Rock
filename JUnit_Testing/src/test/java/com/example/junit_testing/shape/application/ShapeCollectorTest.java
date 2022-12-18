package com.example.junit_testing.shape.application;

import com.example.junit_testing.shape.figures.Circle;
import com.example.junit_testing.shape.figures.Rectangle;
import com.example.junit_testing.shape.figures.Square;
import com.example.junit_testing.shape.interfacee.Shape;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.Assert.*;

class ShapeCollectorTest {

    @Test
    void addFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle("Circle", 10);

        //When
         Shape add = shapeCollector.addFigure(circle);
         System.out.println(add);

        //Then
        assertEquals("Circle", add.getShapeName());
    }

    @Test
    void removeFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle("Circle", 10);
        shapeCollector.addFigure(circle);

        //When
       boolean remove = shapeCollector.removeFigure(circle);

        //Then
        assertTrue(remove);
    }

    @Test
    void getFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle("Circle", 10);
        shapeCollector.addFigure(circle);

        //When
        Shape get = shapeCollector.getFigure(0);
        System.out.println(get);

        //Then
        assertEquals(get, circle);
    }

    @Test
    void showFigures() {
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle("Circle", 10);
        Rectangle rectangle = new Rectangle("Rectangle", 10, 20);
        Square square = new Square("Square", 20);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(rectangle);
        shapeCollector.addFigure(square);

        //When
        List<Shape> showFigures = shapeCollector.showFigures();
        System.out.println(showFigures);

        //Then
        assertEquals(showFigures.size(), 3);
    }
}