package com.example.stream.iterate;

import java.util.stream.Stream;

public final class NumbersGenerator {
    public static void generate(int max) {
        Stream.iterate(1, n -> n + 1)
                .limit(max)
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        NumbersGenerator.generate(100);
    }
}
