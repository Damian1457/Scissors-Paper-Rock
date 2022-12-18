package com.project.iterator.race.listTransfer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.random.RandomGenerator;

public class CollectionAsParameter {
    public static void main(String[] args) {
        List<Integer> theBigList = new ArrayList<Integer>();
        RandomGenerator theGenerator = new Random();

        for (int i = 0; i < 200; i++) {
            theBigList.add(theGenerator.nextInt(100));
        }
        ArrayTester arrayTester = new ArrayTester();
        arrayTester.theList(theBigList);
    }
}