package com.example.stream.Stream;

public class StreamApp {
    public static void main(String[] args) {
        Processor processor = new Processor();
        Executor codeToExecute = () -> System.out.println("Hello World!");
        processor.execute(codeToExecute);
    }
}
