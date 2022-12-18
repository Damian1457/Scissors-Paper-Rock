package com.project.duplicated;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Duplicate {
    private String orderNumber;

    public Duplicate(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Duplicate duplicate = (Duplicate) o;
        return orderNumber == duplicate.orderNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderNumber);
    }

    @Override
    public String toString() {
        return "The number of order is: " + orderNumber;
    }

    public static void main(String[] args) {
        Duplicate duplicate1 = new Duplicate("111111111111");
        Duplicate duplicate2 = new Duplicate("111111111111");
        Duplicate duplicate3 = new Duplicate("111111111111");
        Duplicate duplicate4 = new Duplicate("11111111111122");
        Duplicate duplicate5 = new Duplicate("11111111111122");

        Set<Duplicate> orders = new HashSet<>();
        orders.add(duplicate1);
        orders.add(duplicate2);
        orders.add(duplicate3);
        orders.add(duplicate4);
        orders.add(duplicate5);

        for (Duplicate orderss : orders) {
            System.out.println(orderss);
        }
    }
}
