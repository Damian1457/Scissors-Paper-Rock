package com.example.junit_testing.forum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ForumUserTest {

    @Test
    void addPost() {
        //Given
        ForumUser forumUser = new ForumUser("Damian", "DamianW");

        //When
        forumUser.addPost("Damian", "It's my first post on this forum!");

        //Then
        assertEquals(1, forumUser.getPostsQuantity());
    }

    @Test
    void addComment() {
        //Given
        ForumUser forumUser = new ForumUser("Damian", "DamianW");
        ForumPost thePost = new ForumPost("It's my first post on this forum!", "DamianW");

        //When
        forumUser.addComment(thePost, "Hello my friend, now I'm in the China", "DamianW");

        //Then
        assertEquals(1, forumUser.getCommentsQuantity());
    }

    @Test
    void getPostsQuantity() {
        //Given
        ForumUser forumUser = new ForumUser("Damian", "DamianW");
        ForumPost thePost = new ForumPost("Hello everyone, " + "this is my first contribution here!", "mrsmith");

        //When
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());
        int quantity = forumUser.getPostsQuantity();

        //Then
        assertEquals(1, quantity);
    }

    @Test
    void getCommentsQuantity() {
        //Given
        ForumUser forumUser = new ForumUser("Damian", "DamianW");
        ForumPost thePost = new ForumPost("It's my first post on this forum!", "DamianW");
        ForumComment theComment = new ForumComment(thePost, "mrsmith", "Thank you for all good words!");

        //When
        forumUser.addComment(thePost, theComment.getCommentBody(), theComment.getAuthor());
        int quantity = forumUser.getCommentsQuantity();

        //Then
        assertEquals(1, quantity);
    }

    @Test
    void testGetPost() {
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " + "this is my first contribution here!", "mrsmith");
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());

        //When
        ForumPost retrievedPost;
        retrievedPost = forumUser.getPost(0);

        //Then
        Assertions.assertEquals(thePost, retrievedPost);
    }

    @Test
    void getComment() {
        //Given
        ForumUser forumUser = new ForumUser("Damian", "DamianW");
        ForumPost thePost = new ForumPost("It's my first post on this forum!", "DamianW");
        ForumComment theComment = new ForumComment(thePost, "mrsmith", "Thank you for all good words!");
        forumUser.addComment(thePost, theComment.getCommentBody(), theComment.getAuthor());

        //When
        ForumComment retreivedComment;
        retreivedComment = forumUser.getComment(0);

        //Then
        assertEquals(theComment, retreivedComment);
    }

    @Test
    void removePost() {
        //Given
        ForumUser forumUser = new ForumUser("Damian", "DamianW");
        ForumPost thePost = new ForumPost("It's my first post on this forum!", "DamianW");
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());

        //When
        boolean removePost = forumUser.removePost(thePost);

        //Then
        assertTrue(removePost);
        assertEquals(0, forumUser.getPostsQuantity());
    }

    @Test
    void removeComment() {
        //Given
        ForumUser forumUser = new ForumUser("Damian", "DamianW");
        ForumPost thePost = new ForumPost("It's my first post on this forum!", "DamianW");
        ForumComment theComment = new ForumComment(thePost, "mrsmith", "Thank you for all good words!");
        forumUser.addComment(thePost, theComment.getCommentBody(), theComment.getAuthor());

        //When
        boolean removeComment = forumUser.removeComment(theComment);

        //Then
        assertTrue(removeComment);
        assertEquals(0, forumUser.getCommentsQuantity());
    }
}