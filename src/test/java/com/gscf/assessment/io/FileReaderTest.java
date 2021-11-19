package com.gscf.assessment.io;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class FileReaderTest {

    @Test
    void readFileThrowsException() {
        assertThrows(RuntimeException.class, () -> new FileReader().readFile("/non-existing-file.txt"));
    }
}
