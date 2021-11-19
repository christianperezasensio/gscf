package com.gscf.assessment.math;

import com.gscf.assessment.model.Room;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static java.util.Collections.nCopies;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculatorTest {

    @Test
    void calculateTotalWallpaper() {
        int totalArea = 23;
        int anotherTotalArea = 24;

        assertEquals(totalArea + anotherTotalArea,
                new Calculator().calculateTotalWallpaper(Arrays.asList(
                        new Room(1, 2, 3),
                        new Room(1, 1, 5))));
    }

    @Test
    void getCubicShapedRooms() {
        assertEquals(List.of(
                        new Room(5, 5, 5)),
                new Calculator().getCubicShapedRooms(Arrays.asList(
                        new Room(5, 5, 5),
                        new Room(1, 1, 5))));
    }

    @Test
    void getCubicShapedRoomsIsOrderedByWallpaperNeeded() {
        assertEquals(List.of(
                new Room(8, 8, 8),
                new Room(5, 5, 5)), new Calculator().getCubicShapedRooms(Arrays.asList(
                new Room(5, 5, 5),
                new Room(1, 1, 5),
                new Room(8, 8, 8))));
    }

    @Test
    void getDuplicateRooms() {
        Calculator calculator = new Calculator();
        assertEquals(Set.of(new Room(8, 8, 8)),
                calculator.getDuplicateRooms(nCopies(2, new Room(8, 8, 8))));

        assertTrue(calculator.getDuplicateRooms(Arrays.asList(
                new Room(5, 5, 5),
                new Room(1, 1, 5))).isEmpty());
    }
}
