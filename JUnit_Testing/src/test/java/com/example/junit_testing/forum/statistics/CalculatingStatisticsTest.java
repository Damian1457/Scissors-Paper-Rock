package com.example.junit_testing.forum.statistics;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
class CalculatingStatisticsTest {

    @Mock
    private Statistics statistics;

    public List<String> generateUserNames(int number) {
        List<String> userNames = new ArrayList<>();

        for (int i=1; i <= number; i++) {
            String userName = "User " + i;
            userNames.add(userName);
        }
        return userNames;
    }

    @Test
    void test0Posts() {
        //Given
        CalculatingStatistics calculatingStatistics = new CalculatingStatistics();

    }
}