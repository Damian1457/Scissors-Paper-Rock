package com.example.junit_testing.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void testAdd() {
        //Given
        SimpleCalculator simpleCalculator = new SimpleCalculator(10, 20);

        //When
        int result = simpleCalculator.add(10, 20);
        System.out.println(result);

        //Then
        assertEquals(result, 30);
    }

    @Test
    void testSub() {
        //Given
        SimpleCalculator simpleCalculator = new SimpleCalculator(20, 10);

        //When
        int result = simpleCalculator.sub(20, 10);
        System.out.println(result);

        //Then
        assertEquals(result, 10);
    }

}