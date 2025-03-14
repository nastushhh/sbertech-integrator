package com.sber.phonebook.model;

/**
 * Класс представляет запись в телефонном справочнике.
 * <p>Хранит информацию о владельце, его номере телефона и времени последнего изменения записи</p>
 */
public class phoneModel{
    private String name;
    private String number;
    private long lastChange;

    /**
     * Данный класс создает новую запись в телефонном справочнике.
     *
     * @param name имя владельца
     * @param number номер телефона
     * @param lastChange время последнего изменения в мс
    */
    public phoneModel (String name, String number, long lastChange){
        this.name = name;
        this.number = number;
        this.lastChange = lastChange;
    }

    /**
     * Возвращает имя владельца.
     * @return имя владельца
     */
    public String getName(){
        return name;
    }

    /**
     * Устанавливает имя владельца.
     * @param name новое имя владельца
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Возвращает номер телефона.
     * @return номер телефона
     */
    public String getNumber(){
        return number;
    }

    /**
     * Устанавливает номер телефона.
     * @param number новый номер телефона
     */
    public void setNumber(String number){
        this.number = number;
    }

    /**
     * Возвращает время последнего изменения записи.
     * @return время последнего изменения в записи
     */
    public long getLastChange(){
        return lastChange;
    }

    /**
     * Устанавливает время последнего изменения записи.
     * @param lastChange новое время последнего изменения в мс
     */
    public void setLastChange(long lastChange){
        this.lastChange = lastChange;
    }

    /**
     * Возвращает строковое представление объекта.
     * @return строка с данными владельца, номера телефона и последнего изменения
     */
    @Override
    public String toString(){
        return "phoneModel{name = " + name + ", number = " + number + ", lastChange = " + lastChange + "}";
    }
}
