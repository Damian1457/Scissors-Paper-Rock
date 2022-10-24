package com.project.interfacee.knight;

public class Knight {
    private Quest quest;

    public Knight(Quest quest) {
        this.quest = quest;
    }
    public void knightProcess() {
        System.out.println("Lets's will see, what he do?");
        quest.process();
    }

    public static void main(String[] args) {
        Knight knight = new Knight(new EliteKnightQuest());
        knight.knightProcess();
    }
}
