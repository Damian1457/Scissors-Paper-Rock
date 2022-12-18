package com.example.patterns.challenges.services;

import com.example.patterns.challenges.domain.User;

public interface EmailService {
    boolean sendEmail(User user, boolean isRented);
}
