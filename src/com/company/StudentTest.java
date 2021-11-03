package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student s1 = new Student("Ed", 80, Year.first, List.of(1.0, 2.0, 3.0));

    @BeforeEach
    void setUp() {
    }

    @Test
    void getAverageGrade() {
        Assertions.assertEquals(2.0, s1.getAverageGrade());
    }
}