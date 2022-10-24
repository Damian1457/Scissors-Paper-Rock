package com.project.interfacee.animals;

public class Dog implements Animal {
    @Override
    public String sound() {
        return "Hau hau";
    }

    @Override
    public Integer howMuch() {
        return 2;
    }
}
