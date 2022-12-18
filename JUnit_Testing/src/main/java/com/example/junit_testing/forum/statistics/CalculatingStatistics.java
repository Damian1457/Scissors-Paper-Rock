package com.example.junit_testing.forum.statistics;

public class CalculatingStatistics {
    private double nUsers;
    private double nPosts;
    private double nComments;
    private double avgPostsPerUser;
    private double avgCommentsPerUser;
    private double avgCommentsPerPost;

    public void calculateStatistics(Statistics statistics) {
        nUsers = statistics.usersNames().size();
        nPosts = statistics.postsCount();
        nComments = statistics.commentsCount();

        avgPostsPerUser = nPosts/nUsers;
        avgCommentsPerUser = nComments/nUsers;
        avgCommentsPerPost = nComments/nPosts;
    }

    public void printStatistics() {
        System.out.println("nUsers = " + nUsers);
        System.out.println("nPosts = " + nPosts);
        System.out.println("nComments = " + nComments);
        System.out.println("avgPostsPerUser = " + avgPostsPerUser);
        System.out.println("avgCommentsPerUser = " + avgCommentsPerUser);
        System.out.println("avgCommentsPerPost = " + avgCommentsPerPost);
    }
}
