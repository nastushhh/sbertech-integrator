package com.sber.phonebook.generation;

import java.util.concurrent.ThreadLocalRandom;
/**
 * Класс для генерации случайных чисел в заданных диапазонах.
 */
public class randomGen{
    /**
     *Генерирует случайное значение N в диапазоне от 500 до 5000.
     * @return случайное число N
     */
    public static int getRandomN(){
        return ThreadLocalRandom.current().nextInt(501, 5000);
    }

    /**
     *Генерирует случайное значение M в диапазоне от 0 до 30
     * @return случайное число M
     */
    public static int getRandomM(){
        return ThreadLocalRandom.current().nextInt(0, 30);
    }

    /**
     * Генерирует случайное значение T (60 < T < 300)
     * @return случайное число T
     */
    public static int getRandomT(){
        return ThreadLocalRandom.current().nextInt(61, 300);
    }
}