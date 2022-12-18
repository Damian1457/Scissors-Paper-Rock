package com.example.stream.array;
import java.lang.Math;

public class Ex2 {

//    Write a program that uses a for loop to print the numbers from 1 to 10 (inclusive) to the console.
//
//    Write a program that uses a for loop to print the numbers from 10 to 1 (inclusive) to the console.
//
//    Write a program that uses a for loop to print the even numbers from 2 to 20 (inclusive) to the console.
//
//    Write a program that uses a for loop to print the odd numbers from 1 to 19 (inclusive) to the console.
//
//    Write a program that uses a for loop to print the numbers from 1 to 100 (inclusive). For multiples of 3, print "Fizz" instead of the number, and for multiples of 5, print "Buzz" instead of the number. For numbers that are multiples of both 3 and 5, print "FizzBuzz" instead of the number.
//
//    Write a program that uses a for loop to print the numbers from 1 to 100 (inclusive). For numbers that are prime, print "Prime" instead of the number.
//
//    Write a program that uses a for loop to calculate the sum of the numbers from 1 to 10 (inclusive).
//
//    Write a program that uses a for loop to calculate the product of the numbers from 1 to 10 (inclusive).
//
//    Write a program that uses a for loop to calculate the factorial of a number (e.g. the factorial of 5 is 5 * 4 * 3 * 2 * 1).
//
//    Write a program that uses a for loop to print the elements of an array of strings to the console.

    /*  Davide Piazza19:18
https://chat.openai.com/chat
Davide Piazza19:25
https://pastebin.com/KBw7qGvT
Davide Piazza19:29
https://webwhiteboard.com/board/eMP4omLWzyJt3w2Gpyk5T0paE0LQY3L3/
Davide Piazza19:57
isPrime
Davide Piazza20:18
A prime number is a positive integer greater than 1 that is only divisible by 1 and itself. For example, 2, 3, 5, and 7 are all prime numbers. Prime numbers have long been of interest to mathematicians and number theorists because of the unique way in which they are distributed among the integers.
Davide Piazza20:21
https://pastebin.com/GRN3V65w
*/


    public static void main(String[] args) {

//        for (int i=1; i<=10; i++) {
//            System.out.println(i);
//        }
//
//        for (int i=10; i>=1; i--) {
//            System.out.println(i);
//        }

//        for (int i=2; i<=20; i+=2) {
//            System.out.println(i);
//        }

//        for (int i=1; i<=19; i+=2) {
//            System.out.println(i);
//        }
//
//        for (int i=1; i<=100; i++) {
//            if (i % 5 == 0 && i % 3 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else if (i % 3 == 0 ) {
//                System.out.println("Fizz");
//            } else {
//                System.out.println(i);
//            }
//        }

//        int sum = 0;
//        for (int i=1; i<=10; i++) {
//            sum += i;
//        }
//        System.out.println(sum);
//
//        int result = 1;
//        for (int i=1; i<=10; i++) {
//            result *= i;
//        }
//        System.out.println(result);


    String[] strings = {"Damian", "Konrad", "Zbyszek"};
    printTable(strings);




    }


    public boolean isPrime(int number) {
        for (int i=2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printTable(String[] tableOfStrings) {
            for (int i=0; i< tableOfStrings.length; i++) {
                System.out.println(tableOfStrings[i]);
            }
    }



}
