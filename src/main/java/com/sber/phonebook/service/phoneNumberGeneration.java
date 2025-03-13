package com.sber.phonebook.service;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Генератор случайных телефонных номеров.
 */
public class phoneNumberGeneration{
    /**
     *Данный класс генерирует случайный номер телефона в формате +7-xxx-xxx-xx-xx
     * @return сгенерированный номер телефона
     */
    public static String generatePhoneNumber(){
        int p1 = ThreadLocalRandom.current().nextInt(100, 1000);
        int p2 = ThreadLocalRandom.current().nextInt(100, 1000);
        int p3 = ThreadLocalRandom.current().nextInt(10, 100);
        int p4 = ThreadLocalRandom.current().nextInt(10, 100);
        return String.format("+7-%03d-%03d-%02d-%02d", p1, p2, p3, p4);
    }
}