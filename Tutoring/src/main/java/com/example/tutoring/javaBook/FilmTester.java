package com.example.tutoring.javaBook;

public class FilmTester {
    public static void main(String[] args) {
        Film firstFilm = new Film();
        String title = firstFilm.getTitle();
        title = "James Bond, alone, and die";
        System.out.println(title);

        String what = firstFilm.getWhat();
        what = "Comedy";
        System.out.println(what);

        int number = firstFilm.getNumber();
        number = 4;
        System.out.println(number);
    }
}
