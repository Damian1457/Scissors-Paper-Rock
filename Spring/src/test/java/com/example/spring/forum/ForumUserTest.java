package com.example.spring.forum;

import com.example.spring.intro.shape.Shape;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ForumUserTest {
    @Test
    void testGetUserName() {
        //Given
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.example.spring.forum");
        ForumUser forumUser = applicationContext.getBean(ForumUser.class);

        //When
        String userName = forumUser.getUserName();

        //Then
        assertEquals("John Smith", userName);
    }

    @Test
    void testCircleLoadedIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.example.spring.intro.shape");
        Shape shape = (Shape)context.getBean("circle");

        //When
        String name = shape.getShapeName();

        //Then
        System.out.println("This is a circle." + name);

    }
}