package com.gscf.assessment.math;

import com.gscf.assessment.model.Room;

import java.util.List;

public class Calculator {

    public int calculateTotalWallpaper(List<Room> rooms) {
        return rooms.stream().mapToInt(Room::getArea).sum();
    }

    public List<Integer> getCubicShapedRooms(List<Room> rooms) {
        throw new UnsupportedOperationException();
    }

    public List<String> getDuplicateRooms(List<Room> rooms) {
        throw new UnsupportedOperationException();
    }
}
