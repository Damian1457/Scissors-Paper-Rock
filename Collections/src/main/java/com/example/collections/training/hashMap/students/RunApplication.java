package com.example.collections.training.hashMap.students;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RunApplication {


    public static void main(String[] args) {
        Students students1 = new Students("Damian", "Wąsik", 31);
        Students students2 = new Students("Konrad", "Wąsik", 35);
        Students students3 = new Students("Iza", "Wąsik", 34);
        Students students4 = new Students("Lucjan", "Wąsik", 33);
        Students students5 = new Students("Konstanty", "Wąsik", 32);

        Ratings ratings1 = new Ratings(new Double[]{2.0, 5.0, 6.0, 6.0});
        Ratings ratings2 = new Ratings(new Double[]{2.0, 5.0, 6.0, 6.0});
        Ratings ratings3 = new Ratings(new Double[]{2.0, 5.0, 6.0, 6.0});
        Ratings ratings4 = new Ratings(new Double[]{2.0, 5.0, 6.0, 6.0});
        Ratings ratings5 = new Ratings(new Double[]{2.0, 5.0, 6.0, 6.0});

        Map<Students, Ratings> newStudentsDate = new HashMap<>();
        newStudentsDate.put(students1, ratings1);
        newStudentsDate.put(students2, ratings2);
        newStudentsDate.put(students3, ratings3);
        newStudentsDate.put(students4, ratings4);
        newStudentsDate.put(students5, ratings5);

        System.out.println(newStudentsDate);


        int sum = ratings1.getRating().length;
        Double length = 0.0;
        for (Map.Entry<Students, Ratings> newMap : newStudentsDate.entrySet()) {
            length += Arrays.stream(newMap.getValue().getRating()).count();
            System.out.println(length);
        }
        System.out.println(sum);

    }


}
