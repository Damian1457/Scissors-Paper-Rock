package com.example.junit_testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> newList = new ArrayList<>();
        for (Integer numbersNew : numbers) {
            if (numbersNew % 2 == 0) {
                newList.add(numbersNew);
            }
            System.out.println(newList);
        }
        return newList;
    }
}
