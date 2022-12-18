package com.example.collections.training.averageExcecise.linkedListAverage;

import java.util.List;

public class LinkedList {

    private LinkedListAverage linkedListAverage;

    static void extracted(LinkedListAverage book1, LinkedListAverage book2, LinkedListAverage book3, LinkedListAverage book4, LinkedListAverage book5, LinkedListAverage book6, LinkedListAverage book7, LinkedListAverage book8, LinkedListAverage book9) {
        List<LinkedListAverage> listOfBooks = new java.util.LinkedList<LinkedListAverage>();
        listOfBooks.add(book1);
        listOfBooks.add(book2);
        listOfBooks.add(book3);
        listOfBooks.add(book4);
        listOfBooks.add(book5);
        listOfBooks.add(book6);
        listOfBooks.add(book7);
        listOfBooks.add(book8);
        listOfBooks.add(book9);

        loops(listOfBooks);
    }

    private static void loops(List<LinkedListAverage> listOfBooks) {
        for (LinkedListAverage linkedListAverageNew : listOfBooks) {
            Integer year = linkedListAverageNew.getYear();
            if (year >= 2000) {
                System.out.println(linkedListAverageNew.getName() + " " + linkedListAverageNew.getYear());
            }
        }
    }
}