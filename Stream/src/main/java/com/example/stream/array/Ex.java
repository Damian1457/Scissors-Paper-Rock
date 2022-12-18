package com.example.stream.array;

import java.util.ArrayList;
import java.util.List;

public class Ex {
    // Zadanie 1:
// Napisz funkcje która pobierze liste (ewentualnie tablice) liczb całkowitych i liczbę n.
// Masz wyświetlić wszystkie pary liczb z listy (albo tablicy) które sumowane ze sobą dają liczbę n.
// Np.
// dla liczb { 1, 4, 6, 2, 8 } i liczby 10 zostaną wyświetlone pary:
// 4 6
// 2 8

//537236429

    //19:15 czwartek


    public static void getList(List<Integer> numbers, int number) {
        for (int i=0; i<numbers.size(); i++) {
            for (int j=0; j<numbers.get(i); j++) {

            }
        }
    }




    public static void main(String[] args) {
        int number = 10;
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(4);
        numbers.add(6);
        numbers.add(2);
        numbers.add(8);

        Ex.getList(numbers, number);



        //Exercise 2
//
//        char letter = 'M';
//        System.out.println(letter + 1);
//
//        String name = "Ebnjbo";
//
//        for (int i=0; i<name.length(); i++) {
//            System.out.print((char)(name.charAt(i) - 1));
//        }
    }

}
