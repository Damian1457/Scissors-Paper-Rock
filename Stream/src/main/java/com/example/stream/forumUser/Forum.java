package com.example.stream.forumUser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> theForumUsers = new ArrayList<>();

    public Forum() {
        theForumUsers.add(new ForumUser(1, "Damian", 'M', LocalDate.of(1991, 10, 10), 1));
        theForumUsers.add(new ForumUser(2, "Luiza", 'F', LocalDate.of(2000, 10, 10), 10));
        theForumUsers.add(new ForumUser(3, "Konrad", 'M', LocalDate.of(2000, 10, 10), 11));
        theForumUsers.add(new ForumUser(4, "Iza", 'F', LocalDate.of(2001, 10, 10), 7));
        theForumUsers.add(new ForumUser(5, "Aleksander", 'M', LocalDate.of(2001, 10, 10), 12));
        theForumUsers.add(new ForumUser(6, "Marta", 'F', LocalDate.of(1998, 10, 10), 14));
        theForumUsers.add(new ForumUser(7, "Hubert", 'M', LocalDate.of(2000, 10, 10), 13));
        theForumUsers.add(new ForumUser(8, "Ewa", 'F', LocalDate.of(2010, 10, 10), 21));
    }

    public List<ForumUser> getList() {
        return new ArrayList<>(theForumUsers);
    }
}
