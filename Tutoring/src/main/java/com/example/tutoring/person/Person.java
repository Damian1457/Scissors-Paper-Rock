package com.example.tutoring.person;

public class Person {
    private String name;
    private String gender;
    private char age;

    public Person(String name, String gender, char age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public char getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(char age) {
        this.age = age;
    }

    public int[] sumNumbers(int[] numbers) {
        for (char i=0; i<numbers.length; i++) {
            int number = numbers[i];
            System.out.println(number);
        }
        return numbers;
    }

}
