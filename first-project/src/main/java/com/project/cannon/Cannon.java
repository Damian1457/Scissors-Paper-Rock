package com.project.cannon;

import java.util.LinkedList;
import java.util.List;

public class Cannon {
    private boolean loaded;

    public Cannon(boolean loaded) {
        this.loaded = loaded;
    }

    @Override
    public String toString() {
        return "Cannon{" +
                "loaded=" + loaded +
                '}';
    }

    public void fire() {
        if (loaded) {
            System.out.println("Fire");
            loaded = false;
        } else {
            System.out.println("No ball");
            System.out.println("Reloaded");
            loaded = true;
        }
    }

    public static void main(String[] args) {
        List<Cannon> cannons = new LinkedList<>();
        cannons.add(new Cannon(true));
        cannons.add(new Cannon(false));
        cannons.add(new Cannon(true));
        cannons.add(new Cannon(false));
        cannons.add(new Cannon(true));
        cannons.add(new Cannon(false));
        cannons.add(new Cannon(true));
        cannons.add(new Cannon(false));
        cannons.add(new Cannon(true));

        for (Cannon canon : cannons) {
            canon.fire();
        }
    }
}
