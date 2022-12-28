package com.example.patterns.challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProductRepository {
    private List<Product> theProductList = new ArrayList<>();

    public Product createNewProduct(String productName) {
        Random random = new Random();
        Product newOne = new Product(random.nextInt(), productName, 10.0, 1);
        this.theProductList.add(newOne);
        System.out.println("I create new Product: " + newOne.getProductName());
        return newOne;
    }
}
