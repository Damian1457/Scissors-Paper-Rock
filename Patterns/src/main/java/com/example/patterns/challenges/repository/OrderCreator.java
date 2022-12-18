package com.example.patterns.challenges.repository;

import com.example.patterns.challenges.domain.Order;
import com.example.patterns.challenges.domain.Product;
import com.example.patterns.challenges.domain.User;
import com.example.patterns.challenges.services.OrderService;

public class OrderCreator implements OrderService {

    private boolean isOrdered = true;
    private User user;
    private Product product;

    @Override
    public Order createOrder(User user, Product product) {
        if (isOrdered);
        Order order = new Order(new User("Damian", "d", "s", "d"), new Product("d", 1.0));
        System.out.println(order);
        return order;
    }


    public static void main(String[] args) {
        OrderCreator orderCreator = new OrderCreator();
        User user = new User("Damian", "d", "s", "d");
        Product product = new Product("d", 1.0);
        orderCreator.createOrder(user, product);
    }

}
