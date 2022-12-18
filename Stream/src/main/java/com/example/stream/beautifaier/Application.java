package com.example.stream.beautifaier;

public class Application {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        String name = "ABN";

        poemBeautifier.beautify("Damian", String::toLowerCase);
        poemBeautifier.beautify("Damian", string -> string.replace('D', 'A'));
        poemBeautifier.beautify("Damian", string -> string + name);
        poemBeautifier.beautify("Damian", string -> string.substring(1));
    }
}
