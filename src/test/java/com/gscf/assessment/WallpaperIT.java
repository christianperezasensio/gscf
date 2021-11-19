package com.gscf.assessment;

import org.junit.jupiter.api.Test;

public class WallpaperIT {

    @Test
    void runWallpaper() {
        String[] args = {"/input1.txt"};
        Wallpaper.main(args);
    }
}
