package com.sber.phonebook.generation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class randomGenTest {

    @Test
    public void testGetRandomN() {
        for (int i = 0; i < 100; i++) {
            int n = randomGen.getRandomN();
            assertTrue(n > 500 && n < 5000, "N should be between 500 and 5000, got: " + n);
        }
    }

    @Test
    public void testGetRandomM() {
        for (int i = 0; i < 100; i++) {
            int m = randomGen.getRandomM();
            assertTrue(m >= 0 && m < 30, "M should be between 0 and 30, got: " + m);
        }
    }

    @Test
    public void testGetRandomT() {
        for (int i = 0; i < 100; i++) {
            int t = randomGen.getRandomT();
            assertTrue(t > 60 && t < 300, "T should be between 60 and 300, got: " + t);
        }
    }
}