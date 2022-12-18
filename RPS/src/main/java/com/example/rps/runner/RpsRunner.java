package com.example.rps.runner;

import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean end = false;

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter the number of rounds: ");
        int numRounds = scanner.nextInt();

        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("To play 'rock', press 1.");
        System.out.println("To play 'paper', press 2.");
        System.out.println("To play 'scissors', press 3.");
        System.out.println("To end the game, press 'x'.");
        System.out.println("To start a new game, press 'n'.");

        int userWins = 0;
        int computerWins = 0;
        int draws = 0;

        while (!end) {
            System.out.println("Make a move: ");
            int userMove = scanner.nextInt();

            int computerMove = (int) (Math.random() * 3) + 1;

            String result = scanner.nextLine();

            if (userMove == computerMove) {
                result = "draw";
                draws++;
            } else if (userMove == 1 && computerMove == 2 || userMove == 2 &&
                    computerMove == 3 || userMove == 3 && computerMove == 1) {
                result = "computer wins";
                computerWins++;
            } else {
                result = "user wins";
                userWins++;
            }
            System.out.println("Your move: " + userMove + ", computer's move: " + computerMove);
            System.out.println("Result: " + result);
            System.out.println("Current game result: " + userWins + "-" + computerWins + "-" + draws);

            if (userWins == numRounds || computerWins == numRounds) {
                end = true;
                System.out.println("Game summary: ");
                System.out.println(name + ": " + userWins + " wins");
                System.out.println("Computer: " + computerWins + " wins");
                System.out.println("Draws: " + draws);
                if (userWins == numRounds) {
                    System.out.println(name + " wins!");
                } else {
                    System.out.println("Computer wins!");
                }

                System.out.print("End game (x) or restart (n)? ");
                String choice = scanner.nextLine();
                if (choice.equals("x")) {
                    end = true;
                    break;
                } else if (choice.equals("n")) {
                    end = false;
                    computerWins = 0;
                    userWins = 0;
                    draws = 0;
                    break;
                } else {
                    System.out.println("Invalid choice. Please enter 'x' to end the game or 'n' to restart.");
                }
            }
        }
    }
}
