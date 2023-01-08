package com.example.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.List;

@Configuration
public class BoardConfig {

    @Bean
    public Board board() {
        return new Board((List<TaskList>) toDoList(), (List<TaskList>) inProgressList(), (List<TaskList>) doneList());
    }

    @Bean(name = "doDoList")
    @Scope("prototype")
    public TaskList toDoList() {
        return new TaskList();
    }

    @Bean(name = "inProgress")
    @Scope("prototype")
    public TaskList inProgressList() {
        return new TaskList();
    }

    @Bean(name = "doneList")
    @Scope
    public TaskList doneList(){
        return new TaskList();
    }
}
