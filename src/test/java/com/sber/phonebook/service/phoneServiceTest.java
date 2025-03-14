package com.sber.phonebook.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class phoneServiceTest {

    @Test
    public void testInitialization() {
        phoneService service = new phoneService();
        service.initialize();
        assertEquals(100000, service.getSize(), "Phonebook should contain 100000 records");
    }

    @Test
    public void testRandomParameters() {
        phoneService service = new phoneService();
        service.initialize();
        // Проверяем, что M и T в допустимых диапазонах (через логи)
        assertTrue(service.getSize() > 0); // Просто проверяем, что справочник не пустой
    }
}