package com.example.exception.serviceOnline;

import java.time.LocalDateTime;

public interface RentalRepository {
    boolean createRental(User user, LocalDateTime from, LocalDateTime to);
}
