package com.example.patterns.rentalCars;

import java.time.LocalDateTime;

public class CarRentalService implements RentalService {
    @Override
    public boolean rent(User user, LocalDateTime from, LocalDateTime to) {
        System.out.println("Good");
        return true;
    }
}
