package com.example.patterns.challenges;

public class Order {
    private User user;
    private Product product;
    boolean isOrdeared;

    public Order(User user, Product product, boolean isOrdeared) {
        this.user = user;
        this.product = product;
        this.isOrdeared = true;
    }
}
