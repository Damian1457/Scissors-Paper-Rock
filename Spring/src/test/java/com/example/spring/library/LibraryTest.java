package com.example.spring.library;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

@SpringBootTest
class LibraryTest {

    @Autowired
    private Library library;
    @Test
    void testLoadFromDb() {
        //Given

        //When
        library.loadFromDb();

        //Then
        //do nothing
    }

    @Test
    void testSaveToDb() {
        //Given

        //When
        library.saveToDb();

        //Then
        //do nothing
    }

    @Test
    void testContext() {
        //Given
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(LibraryConfig.class);

        //When & Then
        System.out.println("===== Beans list: ==== >>");
        Arrays.stream(applicationContext.getBeanDefinitionNames())
                        .forEach(System.out::println);
        System.out.println("<< ===== Beans list ====");
    }
}