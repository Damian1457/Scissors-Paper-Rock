package com.example.stream.book;

import java.util.List;
import java.util.stream.Collectors;

public class BookApplication {
    public static void main(String[] args) {
        BookDirectory bookDirectory = new BookDirectory();
        List<Book> theList = bookDirectory.getList().stream()
                .filter(r -> r.getYearOfPublication() > 2005)
                .collect(Collectors.toList());

        System.out.println("# elements: " + theList.size());
        theList.stream()
                .forEach(System.out::println);
    }
}
