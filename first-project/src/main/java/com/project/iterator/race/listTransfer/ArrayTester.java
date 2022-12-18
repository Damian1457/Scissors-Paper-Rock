package com.project.iterator.race.listTransfer;

import java.util.List;

public class ArrayTester {
    public void theList(List<Integer> theList) {
        int temporaryValue;

        for (int i = 0; i < theList.size(); i++) {
            temporaryValue = theList.get(i);

            if (temporaryValue % 2 == 0) {
                System.out.println(temporaryValue);
            }
        }
    }
}
