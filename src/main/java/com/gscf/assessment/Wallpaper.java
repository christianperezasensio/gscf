package com.gscf.assessment;

import com.gscf.assessment.io.FileReader;

public class Wallpaper {

    public static void main(String[] args) {
        String file = args[0];

        FileReader fileReader = new FileReader();

        String wallpaper = fileReader.readFile(file);
    }
}
