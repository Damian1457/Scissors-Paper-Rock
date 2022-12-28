package com.example.patterns.challenges;

public class Product {
    private long id;

    private String productName;

    public Product(long id, String productName, double price, int quantity) {
        this.id = id;
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }
}
