package com.project.clocks;

import java.time.LocalTime;

public class Clocks {
    private LocalTime time;

    public Clocks(LocalTime time) {
        this.time = time;
    }

    public void plusMinutes() {
        time = time.plusHours(1);
    }

    @Override
    public String toString() {
        return "Clocks{" +
                "time=" + time +
                '}';
    }
}
