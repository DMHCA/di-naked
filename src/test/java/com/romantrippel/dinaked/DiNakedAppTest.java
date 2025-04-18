package com.romantrippel.dinaked;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiNakedAppTest {

    @Test
    void testGetMessage() {
        String expected = "Hello from DI Framework!";
        String actual = DiNakedApp.getMessage();
        assertEquals(expected, actual);
    }
}
