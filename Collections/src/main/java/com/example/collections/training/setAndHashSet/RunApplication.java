package com.example.collections.training.setAndHashSet;

import java.time.LocalDate;

public class RunApplication {

    public static void main(String[] args) {
        Books book1 = new Books("name1", "author1", LocalDate.of(1991, 10, 10));
        Books book2 = new Books("name2", "author2", LocalDate.of(2005, 10, 10));
        Books book3 = new Books("name3", "author3", LocalDate.of(2010, 10, 10));
        Books book4 = new Books("name4", "author4", LocalDate.of(1995, 10, 10));
        Books book5 = new Books("name5", "author5", LocalDate.of(2007, 10, 10));

        HashSet.books(book1, book2, book3, book4, book5);
    }
}
