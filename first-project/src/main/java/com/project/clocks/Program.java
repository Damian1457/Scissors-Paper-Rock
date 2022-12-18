package com.project.clocks;

import java.time.LocalTime;
import java.util.LinkedList;

public class Program {

    public static void main(String[] args) {
        Clocks clocks1 = new Clocks(LocalTime.of(17,21,21));
        Clocks clocks2 = new Clocks(LocalTime.of(18,21,21));
        Clocks clocks3 = new Clocks(LocalTime.of(19,21,21));
        Clocks clocks4 = new Clocks(LocalTime.of(20,21,21));

        LinkedList<Clocks> clocksLinkedList = new LinkedList<>();
        clocksLinkedList.add(clocks1);
        clocksLinkedList.add(clocks2);
        clocksLinkedList.add(clocks3);
        clocksLinkedList.add(clocks4);

        for (Clocks clock : clocksLinkedList) {
            clock.plusMinutes();
            System.out.println(clock);
        }
    }
}
