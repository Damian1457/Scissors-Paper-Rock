package com.example.patterns.rentalCars;

import java.time.LocalDateTime;

public class CarRentalRepository implements RentalRepository {
    @Override
    public boolean createRental(User user, LocalDateTime from, LocalDateTime to) {
        System.out.println("Ok");
        return true;
    }
}
