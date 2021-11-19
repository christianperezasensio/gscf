package com.gscf.assessment;

import com.gscf.assessment.io.FileReader;
import com.gscf.assessment.math.Calculator;

import static com.gscf.assessment.utils.Parser.listRooms;

public class Wallpaper {

    public static void main(String[] args) {
        String file = args[0];

        FileReader fileReader = new FileReader();
        Calculator calculator = new Calculator();

        String input = fileReader.readFile(file);
        System.out.println("Total wallpaper needed: " + calculator.calculateTotalWallpaper(listRooms(input)));
    }
}
