package com.gscf.assessment.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RoomTest {

    @Test
    void getArea() {
        int area = 22;
        int smallestSide = 2;
        assertEquals(area + smallestSide, new Room(1, 2, 3).getArea());

        int anotherArea = 22;
        int anotherSmallestSide = 1;
        assertEquals(anotherArea + anotherSmallestSide, new Room(1, 1, 5).getArea());
    }

    @Test
    void isCube() {
        assertTrue(new Room(5, 5, 5).isCube());
    }

    @Test
    void isNotCube() {
        assertFalse(new Room(1, 5, 5).isCube());
    }
}
