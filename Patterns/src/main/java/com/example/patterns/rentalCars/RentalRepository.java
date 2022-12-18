package com.example.patterns.rentalCars;

import java.time.LocalDateTime;

public interface RentalRepository {

    boolean createRental(User user, LocalDateTime from, LocalDateTime to);
}
