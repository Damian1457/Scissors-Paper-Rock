package com.example.patterns.rentalCars;

public class MailService implements InformationService {
    @Override
    public void inform(User user) {
        System.out.println("You are rented the car");
    }
}
