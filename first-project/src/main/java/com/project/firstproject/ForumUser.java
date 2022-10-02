package com.project.firstproject;

public class ForumUser extends User {
    private String userName;
    private int numerPosts;
    private boolean loggedIn;

    public ForumUser(String name, String surname, char gender, int age, String email, String userName, int numerPosts, boolean loggedIn) {
        super(name, surname, gender, age, email);
        this.userName = userName;
        this.numerPosts = numerPosts;
        this.loggedIn = loggedIn;
    }

    public int posts(int numerPosts) {
        if (loggedIn) {
            return getNumerPosts();
        } else
            return 0;
    }

    public boolean logged() {
        System.out.println("Is logged.");
        return true;
    }

    public void userInConsole() {
        System.out.println("User name: " + getName());
        System.out.println("User surname: " + getSurname());
        System.out.println("User email: " + getEmail());
        System.out.println("User age: " + getAge());
        System.out.println("User gender: " + getGender());
        System.out.println("User userName: " + getUserName());
        System.out.println("User posts: " + getNumerPosts());
    }

    public String getUserName() {
        return userName;
    }

    public int getNumerPosts() {
        return numerPosts;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }
}

