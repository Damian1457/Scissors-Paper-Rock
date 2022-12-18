package com.example.junit_testing.collection;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OddNumbersExterminatorTest {

    @Test
    void exterminate() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> newList = new ArrayList<>();
        newList.add(1);
        newList.add(2);
        newList.add(3);
        newList.add(4);
        newList.add(5);
        newList.add(6);
        newList.add(7);
        newList.add(8);
        newList.add(9);

        List<Integer> newOddList = new ArrayList<>();
        newOddList.add(2);
        newOddList.add(4);
        newOddList.add(6);
        newOddList.add(8);

        //When
        List<Integer> result = oddNumbersExterminator.exterminate(newList);

        //Then
        assertEquals(result, newOddList);
    }
}