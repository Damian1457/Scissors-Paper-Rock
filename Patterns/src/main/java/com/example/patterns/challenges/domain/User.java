package com.example.patterns.challenges.domain;

public class User {
    private String userName;
    private String userSurname;
    private String adress;
    private String email;

    public User(String userName, String userSurname, String adress, String email) {
        this.userName = userName;
        this.userSurname = userSurname;
        this.adress = adress;
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public String getAdress() {
        return adress;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userSurname='" + userSurname + '\'' +
                ", adress='" + adress + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
