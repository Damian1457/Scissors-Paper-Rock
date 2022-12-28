package com.example.tutoring.game;

public class Remember {
    private Player player1;
    private Player player2;
    private Player player3;

    public void playTheGame() {
        player1 = new Player();
        player2 = new Player();
        player3 = new Player();

        int type1 = 0;
        int type2 = 0;
        int type3 = 0;

        boolean player1type = false;
        boolean player2type = false;
        boolean player3type = false;

        int numberChoose = (int) (Math.random() * 10);
        System.out.println("I think about number at 0 - 9");

        while (true) {
            System.out.println("Please choose the number at: " + numberChoose);

            player1.whichNumber();
            player2.whichNumber();
            player3.whichNumber();

            type1 = player1.getNumber();
            System.out.println("Player1 choose the number: " + type1);

            type2 = player2.getNumber();
            System.out.println("Player2 choose the number: " + type2);

            type3 = player3.getNumber();
            System.out.println("Player3 choose the number: " + type3);

            if (type1 == numberChoose) {
                player1type = true;
            }

            if (type2 == numberChoose) {
                player2type = true;
            }

            if (type3 == numberChoose) {
                player3type = true;
            }

            if (player1type || player2type || player3type) {
                System.out.println("We have the winner!");
                System.out.println("If player One choose tru? " + player1type);
                System.out.println("If player Two choose tru? " + player2type);
                System.out.println("If player Three choose tru? " + player3type);
                System.out.println("Game is finish.");
                break;
            } else {
                System.out.println("The game is continue!");
            }
        }
    }
}
