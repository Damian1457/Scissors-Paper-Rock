package com.project.secondproject;

public class Data {
    private String name;
    private double age;
    private double height;

    public Data(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }
}
