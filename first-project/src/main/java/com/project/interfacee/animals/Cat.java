package com.project.interfacee.animals;

public class Cat implements Animal {
    @Override
    public String sound() {
        return "Miau miau";
    }

    @Override
    public Integer howMuch() {
        return 5;
    }
}
