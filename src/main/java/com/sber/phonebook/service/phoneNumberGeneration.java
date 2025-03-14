package com.sber.phonebook.service;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Генератор случайных телефонных номеров.
 * <p>Создает номер в формате {@code +7-xxx-xxx-xx-xx}, где каждая группа цифр генерируется случайным образом.</p>
 */
public class phoneNumberGeneration{
    /**
     * Генерирует случайный номер телефона в формате {@code +7-xxx-xxx-xx-xx}.
     * @return сгенерированный номер телефона в виде строки
     */
    public static String generatePhoneNumber(){
        int p1 = ThreadLocalRandom.current().nextInt(100, 1000);
        int p2 = ThreadLocalRandom.current().nextInt(100, 1000);
        int p3 = ThreadLocalRandom.current().nextInt(10, 100);
        int p4 = ThreadLocalRandom.current().nextInt(10, 100);
        return String.format("+7-%03d-%03d-%02d-%02d", p1, p2, p3, p4);
    }
}