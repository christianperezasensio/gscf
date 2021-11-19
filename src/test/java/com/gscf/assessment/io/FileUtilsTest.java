package com.gscf.assessment.io;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static com.gscf.assessment.io.FileUtils.readData;
import static org.junit.jupiter.api.Assertions.*;

class FileUtilsTest {

    @Test
    void readFile() {
        String file = "/input1.txt";
        try {
            assertTrue(readData(file).contains("3x11x24"));
        } catch (IOException e) {
            fail("Error loading file " + file);
        }
    }

    @Test
    void readFileThrowsException() {
        assertThrows(NullPointerException.class, () -> readData("/non-existing-file.txt"));
    }
}
