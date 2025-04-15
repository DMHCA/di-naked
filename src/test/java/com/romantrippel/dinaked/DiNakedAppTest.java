package com.romantrippel.dinaked;

import junit.framework.TestCase;

public class DiNakedAppTest extends TestCase {

    public void testGetMessage() {
        String expected = "Hello from DI Framework!";
        String actual = DiNakedApp.getMessage();
        assertEquals(expected, actual);
    }
}
