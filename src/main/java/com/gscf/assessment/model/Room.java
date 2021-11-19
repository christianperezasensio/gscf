package com.gscf.assessment.model;

import lombok.Data;

import java.util.Arrays;
import java.util.List;

@Data
public class Room {
    private final int length;
    private final int width;
    private final int height;

    public int getArea() {
        int floor = this.getLength() * this.getWidth();
        int wallA = this.getWidth() * this.getHeight();
        int wallB = this.getLength() * this.getHeight();
        return 2 * (floor + wallA + wallB) + getSmallestSide(Arrays.asList(floor, wallA, wallB));
    }

    public boolean isCube() {
        return (this.getLength() == this.getWidth()) && (this.getLength() == this.getHeight());
    }

    private int getSmallestSide(List<Integer> sides) {
        return sides.stream().mapToInt(value -> value).min().orElse(Integer.MAX_VALUE);
    }
}
