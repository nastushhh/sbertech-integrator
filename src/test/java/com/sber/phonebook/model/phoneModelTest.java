package com.sber.phonebook.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class phoneModelTest {

    @Test
    public void testPhoneModelCreation() {
        phoneModel phone = new phoneModel("user1", "+7-123-456-78-90", 1234567890L);
        assertEquals("user1", phone.getName());
        assertEquals("+7-123-456-78-90", phone.getNumber());
        assertEquals(1234567890L, phone.getLastChange());
    }

    @Test
    public void testSetters() {
        phoneModel phone = new phoneModel("user1", "+7-123-456-78-90", 1234567890L);
        phone.setName("user2");
        phone.setNumber("+7-987-654-32-10");
        phone.setLastChange(9876543210L);
        assertEquals("user2", phone.getName());
        assertEquals("+7-987-654-32-10", phone.getNumber());
        assertEquals(9876543210L, phone.getLastChange());
    }

    @Test
    public void testToString() {
        phoneModel phone = new phoneModel("user1", "+7-123-456-78-90", 1234567890L);
        String expected = "phoneModel{name = user1, number = +7-123-456-78-90, lastChange = 1234567890}";
        assertEquals(expected, phone.toString());
    }
}