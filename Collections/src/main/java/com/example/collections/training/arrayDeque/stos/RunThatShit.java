package com.example.collections.training.arrayDeque.stos;

import java.time.LocalDate;
import java.util.ArrayDeque;
import java.util.Deque;

public class RunThatShit {
    public static void main(String[] args) {
        Book book1 = new Book("title1", "author1");
        Book book2 = new Book("title1", "author1");
        Book book3 = new Book("title1", "author1");
        Book book4 = new Book("title1", "author1");

        Order order1 = new Order(book1, LocalDate.now());
        Order order2 = new Order(book2, LocalDate.now());
        Order order3 = new Order(book3, LocalDate.now());

        Deque<Order> newOrderList = new ArrayDeque<>();
        newOrderList.offer(order1);
        newOrderList.offer(order2);
        newOrderList.offer(order3);
        System.out.println(newOrderList.size());

        Order newOrder;
        newOrder = newOrderList.poll();
        newOrder = newOrderList.poll();
        newOrder = newOrderList.poll();
        System.out.println(newOrder);
    }
}
