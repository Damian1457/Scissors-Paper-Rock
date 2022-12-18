package com.example.patterns.challenges.domain;

public class Order {
    private User user;
    private Product product;

    public Order(User user, Product product) {
        this.user = user;
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return "Order{" +
                "user=" + user +
                ", product=" + product +
                '}';
    }
}
