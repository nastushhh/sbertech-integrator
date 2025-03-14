package com.sber.phonebook.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class phoneNumberGenerationTest {

    @Test
    public void testGeneratePhoneNumberFormat() {
        String phoneNumber = phoneNumberGeneration.generatePhoneNumber();
        assertTrue(phoneNumber.matches("\\+7-\\d{3}-\\d{3}-\\d{2}-\\d{2}"));
        assertEquals(16, phoneNumber.length());
    }

    @Test
    public void testGeneratePhoneNumberRandom() {
        String phone1 = phoneNumberGeneration.generatePhoneNumber();
        String phone2 = phoneNumberGeneration.generatePhoneNumber();
        assertNotEquals(phone1, phone2); // Номера должны быть разными
    }
}