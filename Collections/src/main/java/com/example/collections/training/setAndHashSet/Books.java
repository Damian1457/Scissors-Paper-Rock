package com.example.collections.training.setAndHashSet;

import java.time.LocalDate;
import java.util.Objects;

public class Books {
    private String nameOfBook;
    private String nameOfAuthor;
    private LocalDate year;

    public Books(String nameOfBook, String nameOfAuthor, LocalDate year) {
        this.nameOfBook = nameOfBook;
        this.nameOfAuthor = nameOfAuthor;
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Books books = (Books) o;
        return Objects.equals(nameOfBook, books.nameOfBook) && Objects.equals(nameOfAuthor, books.nameOfAuthor) && Objects.equals(year, books.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfBook, nameOfAuthor, year);
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public String getNameOfAuthor() {
        return nameOfAuthor;
    }

    public LocalDate getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Books{" +
                "nameOfBook='" + nameOfBook + '\'' +
                ", nameOfAuthor='" + nameOfAuthor + '\'' +
                ", year=" + year +
                '}';
    }
}
