package com.example.patterns.challenges.services;

import com.example.patterns.challenges.domain.Order;

public interface OrderRepository {
    void saveOrder(Order order);
}
