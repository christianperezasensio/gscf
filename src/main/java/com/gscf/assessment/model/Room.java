package com.gscf.assessment.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Room {
    private int length;
    private int width;
    private int height;

    public int getArea() {
        int floor = this.getLength() * this.getWidth();
        int wallA = this.getWidth() * this.getHeight();
        int wallB = this.getLength() * this.getHeight();
        return 2 * (floor + wallA + wallB) + getSmallestSide(Arrays.asList(floor, wallA, wallB));
    }

    private int getSmallestSide(List<Integer> sides) {
        return sides.stream().mapToInt(value -> value).min().orElse(Integer.MAX_VALUE);
    }
}
