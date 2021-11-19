package com.gscf.assessment.math;

import com.gscf.assessment.model.Room;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void calculateTotalWallpaper() {
        Calculator calculator = new Calculator();
        int totalArea = 23;
        int anotherTotalArea = 24;

        assertEquals(totalArea + anotherTotalArea,
                calculator.calculateTotalWallpaper(Arrays.asList(
                        new Room(1, 2, 3),
                        new Room(1, 1, 5))));
    }
}
