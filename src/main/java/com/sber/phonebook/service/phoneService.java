package com.sber.phonebook.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.sber.phonebook.model.phoneModel;
import java.util.*;
import java.util.stream.IntStream;

/**
 * Сервис для управления телефонным справочником.
 */
public class phoneService{
    private static final Logger logger = LoggerFactory.getLogger(phoneService.class);
    private final Map<String, phoneModel> phonebook = new HashMap<>();
    private static final int INIT_SIZE = 100000;

    /**
     * Инициализирует справочник из 100000 записей.
     */
    public void initialize(){
        long startTime = System.currentTimeMillis();
        IntStream.range(0, INIT_SIZE).forEach(i -> {
            String name = "user" + i;
            String number = phoneNumberGeneration.generatePhoneNumber();
            phonebook.put(name, new phoneModel(name, number, startTime));
        });
        logger.info("phonebook is initialized with {} records", INIT_SIZE);
    }
    /**
     * Возвращает текущий размер справочника.
     * @return размер справочника
     */
    public int getSize(){
        return phonebook.size();
    }
}
