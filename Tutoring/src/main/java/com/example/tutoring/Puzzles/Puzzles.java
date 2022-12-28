package com.example.tutoring.Puzzles;

public class Puzzles {
    private int x;

    public Puzzles(int x) {
        this.x = x;
    }

    public void puzzles() {
        while (x > 0) {
            if (x > 2) {
                System.out.print("a");
            }

            if (x == 2) {
                System.out.print("b c");
            }

            x = x - 1;
            System.out.print("-");
            if (x == 1) {
                System.out.print("d");
                x = x - 1;
            }
        }
    }

    public static void main(String[] args) {
        Puzzles puzzles = new Puzzles(3);
        puzzles.puzzles();
    }
}
