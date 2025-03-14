package com.sber.phonebook.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.sber.phonebook.model.phoneModel;
import com.sber.phonebook.generation.randomGen;
import java.util.*;
import java.util.concurrent.*;
import java.util.stream.IntStream;

/**
 * Сервис для управления телефонным справочником.
 * <p>Позволяет инициализировать справочник, обновлять номера, выводить записи.</p>
 */
public class phoneService{
    private static final Logger logger = LoggerFactory.getLogger(phoneService.class);
    private final Map<String, phoneModel> phonebook = new HashMap<>();
    private static final int INIT_SIZE = 100000;
    private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
    private final int mSec;
    private final int tSec;

    /**
     * Конструктор сервиса.
     * <p>Генерирует случайные значения M и T, которые используются для обновления и вывода номеров.</p>
     */
    public phoneService(){
        this.mSec = randomGen.getRandomM();
        this.tSec = randomGen.getRandomT();
        logger.info("initialized with m = {} sec, t = {} sec", mSec, tSec);
    }

    /**
     * Инициализирует справочник из 100000 записей.
     * <p>Для каждой записи создается случайное имя и номер телефона.</p>
     */
    public void initialize(){
        long startTime = System.currentTimeMillis();
        IntStream.range(0, INIT_SIZE).forEach(i -> {
            String name = "user" + i;
            String number = phoneNumberGeneration.generatePhoneNumber();
            phonebook.put(name, new phoneModel(name, number, startTime));
        });
        logger.info("phonebook is initialized with {} records", INIT_SIZE);
        numberUpdate();
        printTask(startTime);
    }

    /**
     * Данная функция запускает процесс обновление случайных номеров.
     * <p>Обновляет часть номеров в справочнике, затем планирует следующее обновление.</p>
     */
    private void numberUpdate(){
        Runnable updateTask = () ->{
            int numbersToUpdate = ThreadLocalRandom.current().nextInt(1, INIT_SIZE / 10);
            IntStream.range(0, numbersToUpdate).forEach(i -> {
                String key = "user" + ThreadLocalRandom.current().nextInt(INIT_SIZE);
                phoneModel phone = phonebook.get(key);
                if (phone != null){
                    phone.setNumber(phoneNumberGeneration.generatePhoneNumber());
                    phone.setLastChange(System.currentTimeMillis());
                }
            });
            logger.info("updated {} phone numbers", numbersToUpdate);
            scheduler.schedule(this::numberUpdate, randomGen.getRandomN(), TimeUnit.MILLISECONDS);
        };
        scheduler.schedule(updateTask, randomGen.getRandomN(), TimeUnit.MILLISECONDS);
    }

    /**
     * Данный метод выводит через заданное время T записи, которые не изменялись более M секунд.
     * <p>Запускает задачу, которая фильтрует и выводит устаревшие записи.</p>
     * @param startTime время начала программы.
     */
    private void printTask(long startTime){
        Runnable print = () -> {
            long currentTime = System.currentTimeMillis();
            long mAgo = currentTime - (mSec * 1000L);
            phonebook.values().stream()
                    .filter(phone -> phone.getLastChange() <= mAgo)
                    .forEach(phone -> logger.info("record from {} sec ago: {}", mSec, phone));
            logger.info("printed phones that were unchanged for {} sec", mSec);
            scheduler.shutdownNow();
        };
        scheduler.schedule(print, tSec, TimeUnit.SECONDS);
    }

    /**
     * Возвращает текущий размер справочника.
     * @return количество записей в справочнике
     */
    public int getSize(){
        return phonebook.size();
    }
}
