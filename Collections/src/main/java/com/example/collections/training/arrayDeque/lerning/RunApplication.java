package com.example.collections.training.arrayDeque.lerning;

import java.time.LocalDateTime;
import java.util.ArrayDeque;
import java.util.Deque;

public class RunApplication {
    public static void main(String[] args) {
        Book book1 = new Book("The good time", "DamianW", 1991);
        Book book2 = new Book("The good time", "DamianW", 1991);
        Book book3 = new Book("The good time", "DamianW", 1991);

        Order order1 = new Order(book1, LocalDateTime.now());
        Order order2 = new Order(book2, LocalDateTime.now());
        Order order3 = new Order(book3, LocalDateTime.now());
        Order order4 = new Order(book2, LocalDateTime.now());
        Order order5 = new Order(book1, LocalDateTime.now());

        Deque<Order> sameOrders = new ArrayDeque<>();
        sameOrders.offer(order1);
        sameOrders.offer(order2);
        sameOrders.offer(order3);
        sameOrders.offer(order4);
        sameOrders.offer(order5);
        System.out.println(sameOrders.size());
        System.out.println();

        Order newOrders;
        newOrders = sameOrders.pollFirst();
        System.out.println(sameOrders.size());


    }
}