package com.example.tutoring.Krasoman;

public class Krasoman {
    private String[] wordListOne;
    private String[] worldListTwo;
    private String[] worldListThree;

    public Krasoman() {
        this.wordListOne = new String[]{"Damian", "Konrad", "Monika", "Marlena", "Alicja", "Ewa"};
        this.worldListTwo = new String[]{"Wasik", "Pomian", "Zwierzchowski", "Tajdus", "Duda", "Morawiecki"};
        this.worldListThree = new String[]{"Warszawa", "Berlin", "Krakow", "Budapeszt", "Jerozolima", "Moskwa"};

        int listOneLength = wordListOne.length;
        int listTwoLength = worldListTwo.length;
        int listThreeLength = worldListThree.length;

        int randomOne = (int) (Math.random() * listOneLength);
        int randomTwo = (int) (Math.random() * listTwoLength);
        int randomThree = (int) (Math.random() * listThreeLength);

        String sentence = wordListOne[randomOne] + " " + worldListTwo[randomTwo] + " " + worldListThree[randomThree] + " . ";
        System.out.println(sentence);
    }

    public static void main(String[] args) {
        Krasoman krasoman = new Krasoman();
    }
}
