package com.example.spring.intro.shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DrawerTest {

    @Test
    void testDoDrawingTheSquare() {
        //Given
        Square square = new Square();

        //When
        Drawer drawer = new Drawer(square);
        String result = drawer.doDrawing();

        //Then
        assertEquals(result, "This is a Square");
    }
}