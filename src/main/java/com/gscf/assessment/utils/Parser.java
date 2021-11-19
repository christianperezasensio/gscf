package com.gscf.assessment.utils;

import com.gscf.assessment.model.Room;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Parser {

    public static List<Room> listRooms(String input) {
        return Arrays.stream(input.split("\n"))
                .map(line -> line.split("x"))
                .map(values -> new Room(Integer.parseInt(values[0]), Integer.parseInt(values[1]), Integer.parseInt(values[2]))).collect(Collectors.toList());
    }
}
