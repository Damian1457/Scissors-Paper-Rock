package com.example.patterns.challenges;

import java.util.Scanner;

public class View {
    private ProductService productService = new ProductService();
    public void init() {
        System.out.println("Hello");

        System.out.println("Select a new operation");
        Scanner scanner = new Scanner(System.in);
        int option = -1;

        while (option != 0) {
            System.out.println("1. Add new Product");
            System.out.println("0. Exit the system");
            option = Integer.parseInt(scanner.nextLine());

            if (option == 1) {
                this.handlerCreateNewBook(scanner);
            } else if (option == 0) {
                System.out.println("I terminate the program");
            }
        }
    }

    private void handlerCreateNewBook(Scanner scanner) {
        System.out.println("Give the name od a Product");
        String productName = scanner.nextLine();
        productService.createNewProduct(productName);
    }
}
