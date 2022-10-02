package com.project.firstproject;

public class Application {
    public static void main(String[] args) {

        ForumUser forumUser = new ForumUser("Damian", "Wąsik", 'M', 31,
                "damianwasik.coach@gmail.com", "damianwasik", 2, true);
        forumUser.logged();
        forumUser.userInConsole();
    }
}

