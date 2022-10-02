package com.project.secondproject;

public class Application {
    public static void main(String[] args) {
        Data data = new Data("Damian", 21, 160);
        Gender gender = new Gender();
        gender.data(data);
    }
}
