package com.example.patterns.rentalCars;

public class RentalDto {
    private User user;
    boolean isRented;

    public RentalDto(User user, boolean isRented) {
        this.user = user;
        this.isRented = isRented;
    }
}
