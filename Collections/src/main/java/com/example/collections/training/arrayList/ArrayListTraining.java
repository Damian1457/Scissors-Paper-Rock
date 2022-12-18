package com.example.collections.training.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTraining {
    private List<String> newlist = new ArrayList<>();

    public ArrayListTraining(List<String> newlist) {
        this.newlist = newlist;
        newlist.add("Damian");
        newlist.add("Lucjan");
        newlist.add("Konstanty");
        newlist.add("Gracjan");
        newlist.add("Teofil");
        newlist.add("Leonard");
        newlist.add("Barbara");
        newlist.add("Bogusia");
        newlist.add("Frank");

        for (int i = 0; i < newlist.size(); i++) {
            System.out.println("The list elements is " + i + " " + newlist.get(i));
        }
        newlist.remove(newlist.size() - 3);
        System.out.println("Removing one element for list");

        for (int i = 0; i < newlist.size(); i++) {
            System.out.println("The list elements is " + i + " " + newlist.get(i));
        }

    }

    public static void main(String[] args) {
        ArrayListTraining training = new ArrayListTraining(new ArrayList<>());
        System.out.println(training);
    }

    public List<String> getNewlist() {
        return newlist;
    }
}
