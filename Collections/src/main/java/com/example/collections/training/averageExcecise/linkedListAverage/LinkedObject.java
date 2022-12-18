package com.example.collections.training.averageExcecise.linkedListAverage;

public class LinkedObject {
    public static void extracted() {
        LinkedListAverage book1 = new LinkedListAverage("book1", 1991);
        LinkedListAverage book2 = new LinkedListAverage("book2", 1992);
        LinkedListAverage book3 = new LinkedListAverage("book3", 1993);
        LinkedListAverage book4 = new LinkedListAverage("book4", 1994);
        LinkedListAverage book5 = new LinkedListAverage("book5", 1995);
        LinkedListAverage book6 = new LinkedListAverage("book6", 2001);
        LinkedListAverage book7 = new LinkedListAverage("book7", 2002);
        LinkedListAverage book8 = new LinkedListAverage("book8", 2003);
        LinkedListAverage book9 = new LinkedListAverage("book9", 2004);

        LinkedList.extracted(book1, book2, book3, book4, book5, book6, book7, book8, book9);
    }
}