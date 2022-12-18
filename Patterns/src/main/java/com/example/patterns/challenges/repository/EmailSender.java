package com.example.patterns.challenges.repository;

import com.example.patterns.challenges.domain.User;
import com.example.patterns.challenges.services.EmailService;

public class EmailSender implements EmailService {

    boolean isRented = true;

    @Override
    public boolean sendEmail(User user, boolean isRented) {
        if (isRented) {
            System.out.println("Your order is request: " + user);
        }
        return isRented;
    }
}
