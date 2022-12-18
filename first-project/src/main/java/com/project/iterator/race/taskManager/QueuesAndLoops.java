package com.project.iterator.race.taskManager;

import java.util.ArrayDeque;
import java.util.Deque;

public class QueuesAndLoops {
    public static void main(String[] args) {

        Deque<String> theFirst = new ArrayDeque<String>();
        for (int n = 0; n < 5; n++) {
            theFirst.offer("Task: " + (n + 1));
        }

        Deque<String> thesecond = new ArrayDeque<String>();
        for (int n = 0; n < 5; n++) {
            thesecond.offer("Task: " + (n + 1));
        }

        TaskManager taskManager = new TaskManager();
        taskManager.executeTasks(theFirst);
        taskManager.executeTasks(thesecond);
    }
}