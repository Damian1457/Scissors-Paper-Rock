package com.example.junit_testing.test;

import com.example.junit_testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("Damian");
        String result = simpleUser.getUsername();

        if (result.contains("Damian")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
