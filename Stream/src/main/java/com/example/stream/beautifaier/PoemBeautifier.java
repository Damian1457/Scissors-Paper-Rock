package com.example.stream.beautifaier;

public class PoemBeautifier {
    public void beautify(String text, PoemDecorate poemDecorate) {
        String result = poemDecorate.decorate(text);
        System.out.println(result);
    }
}
