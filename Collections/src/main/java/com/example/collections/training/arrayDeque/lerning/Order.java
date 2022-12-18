package com.example.collections.training.arrayDeque.lerning;

import java.time.LocalDateTime;

public class Order {
    private Book book;
    private LocalDateTime orderDate;

    public Order(Book book, LocalDateTime orderDate) {
        this.book = book;
        this.orderDate = orderDate;
    }

    public Book getBook() {
        return book;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "book=" + book +
                ", orderDate=" + orderDate +
                '}';
    }
}
