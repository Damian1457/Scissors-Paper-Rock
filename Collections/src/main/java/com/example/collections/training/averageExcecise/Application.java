package com.example.collections.training.averageExcecise;

import com.example.collections.training.averageExcecise.arrayListAverage.ArrayListAverage;
import com.example.collections.training.averageExcecise.linkedListAverage.LinkedObject;

import java.util.LinkedList;

public class Application {
    public static void main(String[] args) {
        ArrayListAverage average = new ArrayListAverage(new LinkedList<Integer>());
        average.averageList();

        LinkedObject.extracted();
    }

}