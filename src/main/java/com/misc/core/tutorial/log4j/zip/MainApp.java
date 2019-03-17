package com.misc.core.tutorial.log4j.zip;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class MainApp {
//    private static final Log logger = LogFactory.getLog(MainApp.class);

    private static final Logger logger = LogManager.getLogger(MainApp.class);

    public static void main(String[] args) {

        for (int i = 0; i < 10000; i++) {
            logger.info("INFO: Rolling file appender example...");
            logger.trace("TRACE: Rolling file appender example...");
            logger.debug("DEBUG: Rolling file appender example...");
            logger.error("ERROR: Rolling file appender example...");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}