package com.example.tutoring.forLoop;

import java.util.ArrayList;
import java.util.List;

public class Thursday {
    public static void main(String[] args) {

        //1.
//        int[] numbers = {20, 10, 40, 30};
//        for (int i=0; i<numbers.length; i++) {
//             System.out.println(numbers[i]);
//        }

        //2.
        List<Integer> theWords = new ArrayList<>();
        theWords.add(10);
        theWords.add(20);
        theWords.add(30);
        theWords.add(40);
        theWords.add(50);
        theWords.add(60);
        theWords.add(70);

        for (int i=1; i<=10; i++) {
           System.out.println(i);
        }

    }
}
