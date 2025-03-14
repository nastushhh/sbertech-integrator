package com.sber.phonebook;

import com.sber.phonebook.service.phoneService;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;


public class Main{
    private static final Logger logger = LoggerFactory.getLogger(Main.class);
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