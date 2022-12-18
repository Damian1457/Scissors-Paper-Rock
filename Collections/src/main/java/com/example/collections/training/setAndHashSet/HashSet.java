package com.example.collections.training.setAndHashSet;

import java.util.Set;

public class HashSet {
    static void books(Books book1, Books book2, Books book3, Books book4, Books book5) {
        Set<Books> newBooksList = new java.util.HashSet<Books>();
        newBooksList.add(book1);
        newBooksList.add(book2);
        newBooksList.add(book3);
        newBooksList.add(book4);
        newBooksList.add(book5);

        loops(newBooksList);
    }

    private static void loops(Set<Books> newBooksList) {
        for (Books theBooks : newBooksList) {
            if (theBooks.getYear().getYear() >= 2010) {
                System.out.println(theBooks);
            }
        }
    }
}