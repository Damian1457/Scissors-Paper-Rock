package com.example.spring.portfolio;

import java.util.List;

public class Board {
    private List<TaskList> toDoList;
    private List<TaskList> inProgressList;
    private List<TaskList> doneList;

    public Board(List<TaskList> toDoList, List<TaskList> inProgressList, List<TaskList> doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }
}
