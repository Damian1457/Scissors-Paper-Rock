package com.example.tutoring.classes;

import com.example.tutoring.classes.view.Table;
import com.example.tutoring.classes.view.UserInterface;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        UserInterface gui = new UserInterface();

        Table table = new Table();
        table.setPosition(50, 50);
        table.setRowHeight(50);

        for (int i = 0; i < 10; i++) {
            table.addRow();
            for (int j = 0; j < 10; j++) {
                int value = (i+1) * (j+1);
                Label label = new Label(Integer.toString(value));
                table.addColumn(i, label);
            }
        }

        Frame frame = new Frame();
        table.addToFrame(frame);
        frame.setLayout(null);
        frame.setSize(600, 600);
        frame.setVisible(true);
    }
}

//1. Chciałbym zrobić oddzielną klasę z której będę pobierał samoloty, nie musząc ich tworzyć w konstruktorze.
//2. Umieścić samoloty w bazie danych.
//3. Automatyczne pobieranie listy z bazy danych.
//4. Po zalogowaniu będę widział listę samolotów, i będę mógł to dodawać w przeglądarce.




