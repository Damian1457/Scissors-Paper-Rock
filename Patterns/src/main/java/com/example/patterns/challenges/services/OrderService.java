package com.example.patterns.challenges.services;

import com.example.patterns.challenges.domain.Order;
import com.example.patterns.challenges.domain.Product;
import com.example.patterns.challenges.domain.User;

public interface OrderService {
    Order createOrder(User user, Product product);
}
