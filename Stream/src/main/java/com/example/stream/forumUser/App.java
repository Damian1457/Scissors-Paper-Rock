package com.example.stream.forumUser;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, ForumUser> resultList = forum.getList().stream()
                .filter(sex -> sex.getSex() == 'M')
                .filter(date -> Period.between(date.getBirthDate(), LocalDate.now()).getYears() > 20)
                .filter(posts -> posts.getNumberOfPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser));

        System.out.println(resultList.size());
        resultList.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
