package com.project.firstproject;

public class User {
    private String name;
    private String surname;
    private char gender;
    private int age;
    private String email;

    public User(String name, String surname, char gender, int age, String email) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
        this.email = email;
    }

    public void logIn(String name) {
        System.out.println("You are loggedIn " + name);
    }

    public void deletingAccount(String name, String surname) {
        System.out.println("Your account is deleting " + name + " " + surname);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }
}

