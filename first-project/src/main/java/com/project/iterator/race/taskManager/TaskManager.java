package com.project.iterator.race.taskManager;

import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class TaskManager {
    private final List<String> executeTasks;

    public TaskManager() {
        this.executeTasks = new ArrayList<>();
    }

    public void executeTasks(Deque<String> theQueue) {
        while (theQueue.size() > 0) {
            String theTask = theQueue.poll();
            System.out.println(theTask);

            executeTasks.add(theTask);
        }
        System.out.println("\nExecuted total " + executeTasks.size() + " tasks\n");
    }
}
