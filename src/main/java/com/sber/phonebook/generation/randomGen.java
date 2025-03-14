package com.sber.phonebook.generation;

import java.util.concurrent.ThreadLocalRandom;
/**
 * Класс для генерации случайных чисел в заданных диапазонах.
 * Использует {@link ThreadLocalRandom} для генерации случайных значений.
 * <p>Содержит методы для получения случайных чисел N, M, T в определенных диапазонах</p>
 */
public class randomGen{
    /**
     *Генерирует случайное значение N в диапазоне от 500 до 5000.
     * @return случайное число N: 500 &lt; N &gt; 5000.
     */
    public static int getRandomN(){
        return ThreadLocalRandom.current().nextInt(501, 5000);
    }

    /**
     *Генерирует случайное значение M в диапазоне от 0 до 30
     * @return случайное число M: 0 &lt; M &gt; 30.
     */
    public static int getRandomM(){
        return ThreadLocalRandom.current().nextInt(0, 30);
    }

    /**
     * Генерирует случайное значение T от 60 до 300
     * @return случайное число T: 60 &lt; T &gt; 300.
     */
    public static int getRandomT(){
        return ThreadLocalRandom.current().nextInt(61, 300);
    }
}