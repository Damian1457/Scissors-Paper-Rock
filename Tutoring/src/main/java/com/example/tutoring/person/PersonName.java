package com.example.tutoring.person;

public class PersonName {
    private Person person;

    public String getName(Person person) {
        System.out.println(person.getName());
        return person.getName();
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        int[] number = {10, 20, 30, 40};
        person1.sumNumbers(number);
    }
}
