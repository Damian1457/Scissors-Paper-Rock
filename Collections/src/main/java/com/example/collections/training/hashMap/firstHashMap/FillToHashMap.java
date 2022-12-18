package com.example.collections.training.hashMap.firstHashMap;

import java.util.HashMap;
import java.util.Map;

public class FillToHashMap {
    private Map<String, Integer> newMap;

    public FillToHashMap() {
        this.newMap = newMap;
        newMap = new HashMap<>();
    }

    public static void main(String[] args) {
        FillToHashMap fill = new FillToHashMap();
        fill.cerateMap();
    }

    public void cerateMap() {
        newMap.put("Damian", 1);
        newMap.put("Konrad", 2);
        newMap.put("Iza", 3);
        newMap.put("Fatima", 4);
        newMap.put("Tatiana", 5);
        loop();
    }

    private void loop() {
        for (Map.Entry<String, Integer> newMapValue : newMap.entrySet()) {
            System.out.println(newMapValue.getKey() + " " + newMapValue.getValue());
        }
    }

}
