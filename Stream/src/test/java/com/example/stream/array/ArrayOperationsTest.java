package com.example.stream.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayOperationsTest {

    @Test
    void getAverage() {
        //Given
        int[] numbers = {10, 20, 20, 20, 21};

        //When
        Double average = ArrayOperations.getAverage(numbers);
        System.out.println(average);

        //Then
        assertEquals(average, 18.2);
    }
}