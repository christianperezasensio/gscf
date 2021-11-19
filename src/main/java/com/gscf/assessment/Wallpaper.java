package com.gscf.assessment;

import com.gscf.assessment.io.FileReader;
import com.gscf.assessment.math.Calculator;
import com.gscf.assessment.model.Room;

import java.util.List;

import static com.gscf.assessment.utils.Parser.listRooms;

public class Wallpaper {

    public static void main(String[] args) {
        String file = args[0];

        FileReader fileReader = new FileReader();
        Calculator calculator = new Calculator();

        String input = fileReader.readFile(file);
        List<Room> rooms = listRooms(input);
        System.out.println("Total wallpaper needed: " + calculator.calculateTotalWallpaper(rooms));

        System.out.println("Cubic rooms:");
        for (Room room : calculator.getCubicShapedRooms(rooms)) {
            System.out.println(room);
        }

        System.out.println("Duplicate rooms:");
        for (Room room : calculator.getDuplicateRooms(rooms)) {
            System.out.println(room);
        }
    }
}
