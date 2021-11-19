package com.gscf.assessment.math;

import com.gscf.assessment.model.Room;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Calculator {

    public int calculateTotalWallpaper(List<Room> rooms) {
        return rooms.stream().mapToInt(Room::getArea).sum();
    }

    public List<Room> getCubicShapedRooms(List<Room> rooms) {
        return rooms.stream()
                .filter(Room::isCube)
                .sorted(Comparator.comparingInt(Room::getLength).reversed())
                .collect(Collectors.toList());
    }

    public List<Room> getDuplicateRooms(List<Room> rooms) {
        throw new UnsupportedOperationException();
    }
}
