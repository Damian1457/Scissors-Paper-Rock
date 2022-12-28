package com.example.patterns.challenges;

public class ProductService {
    private ProductRepository repository = new ProductRepository();

    public Product createNewProduct(String productName) {
        return this.repository.createNewProduct(productName);
    }
}
