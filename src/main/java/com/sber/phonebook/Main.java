package com.sber.phonebook;

import com.sber.phonebook.service.phoneService;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

/**
 * Главный класс приложения для справочника телефонных номеров.
 * Запускает программу и инициализирует сервис телефонного справочника.
 */
public class Main{
    private static final Logger logger = LoggerFactory.getLogger(Main.class);
    /**
     * Точка входа в приложение.
     * Инициализирует сервис телефонного справочника и выводит сообщения о статусе.
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args){
        try {
            phoneService service = new phoneService();
            service.initialize();
            logger.info("phonebook application started");
        } catch (Exception e){
            logger.error("error running application", e);
        }
    }
}