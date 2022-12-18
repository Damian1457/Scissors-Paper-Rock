package com.example.collections.training.linkedList;

import java.util.List;

public class LinkedListTraining {
    private List<String> newList;

    public LinkedListTraining(List<String> newList) {
        this.newList = newList;
        newList.add("Rege");
        newList.add("Pop");
        newList.add("Methalica");
        newList.add("Jazz");
        newList.add("Techno");

        for (String name : newList) {
            if (name.length() < 5) {
                System.out.println("The list elements is " + name);
            }
        }
    }
}
