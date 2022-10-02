package com.project.secondproject;

public class Gender {
    private Data data;

    public void data(Data data) {
        if (data.getName() != null) {
            if (data.getAge() > 30 && data.getHeight() > 160) {
                System.out.println("User is older than 30 and higher then 160cm");
            } else {
                System.out.println("User is younger than 30 or lower than 160cm");
            }
        }
    }
}
