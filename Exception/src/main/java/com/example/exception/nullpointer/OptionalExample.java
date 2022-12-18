package com.example.exception.nullpointer;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        User user = new User("Damian");
        Optional<User> optionalUser = Optional.ofNullable(user);

        String userName = optionalUser.orElse(new User("")).getName();
        System.out.println(userName);
    }
}
