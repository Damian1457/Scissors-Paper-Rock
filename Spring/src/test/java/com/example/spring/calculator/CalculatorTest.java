package com.example.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorTest {

    @Autowired
    private Calculator calculator;

    @Test
    void testCalculationsMethods() {
        //Given
        //When
        calculator.add(10, 20);
        calculator.sub(40, 20);
        calculator.mul(5, 5);
        calculator.div(4, 2);

        //Then
        //do nothing
    }
}