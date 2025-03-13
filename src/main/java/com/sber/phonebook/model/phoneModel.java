package com.sber.phonebook.model;

/**
 * Класс представляет запись в телефонном справочнике.
 */
public class phoneModel{
    private String name;
    private String number;
    private long lastChange;

    /**
    @param name имя владельца
    @param number номер телефона
    @param lastChange время последнего изменения в мс
    */
    public phoneModel (String name, String number, long lastChange){
        this.name = name;
        this.number = number;
        this.lastChange = lastChange;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getNumber(){
        return number;
    }
    public void setNumber(String number){
        this.number = number;
    }
    public long getLastChange(){
        return lastChange;
    }
    public void setLastChange(long lastChange){
        this.lastChange = lastChange;
    }

    @Override
    public String toString(){
        return "phoneModel{name = " + name + ", number = " + number + ", lastChange = " + lastChange + "}";
    }
}
