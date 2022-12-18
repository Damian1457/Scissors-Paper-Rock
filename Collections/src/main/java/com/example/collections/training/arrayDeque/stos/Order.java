package com.example.collections.training.arrayDeque.stos;

import java.time.LocalDate;
import java.util.Objects;

public class Order {
    private Book book;
    private LocalDate orderDate;

    public Order(Book book, LocalDate orderDate) {
        this.book = book;
        this.orderDate = orderDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(book, order.book) && Objects.equals(orderDate, order.orderDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(book, orderDate);
    }

    @Override
    public String toString() {
        return "Order{" +
                "book=" + book +
                ", orderDate=" + orderDate +
                '}';
    }
}
