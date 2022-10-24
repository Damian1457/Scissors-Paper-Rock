package com.project.interfacee.animals;

public class AnimalPerform {
    public String animalGo(Animal animal) {
        return "I am sure that this is: " + animal.sound() + " and sounds like: " + animal.howMuch();
    }

    public static void main(String[] args) {
        AnimalPerform animalPerform = new AnimalPerform();
        String finish = animalPerform.animalGo(new Cat());
        System.out.println(finish);
    }
}
