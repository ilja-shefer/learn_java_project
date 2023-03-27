package com.mycompany.lesson3;

/**
 * A class containing a very simple Example of using a Logger
 */
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingExample {

    private static final Logger logger = Logger.getLogger(LoggingExample.class.getName());

    public static void logWithLogger() {
        String user = "Bob";
        String message = String.format("User %s is %d years old.", user, 11);
        
        // Two different notations for the same thing
        logger.log(Level.INFO, message);
        //logger.info(message);
        
        // Two different notations for the same thing
        logger.log(Level.WARNING, "This is a very serious warning");
        //logger.warning(message);
    }

    public static void logWithPrintln() {
        String message = String.format("User %s is %d years old.", "Zack", 22);
        System.out.println(message);
    }

    public static void worker() {
        System.out.println("=================");
        
        logger.log(Level.INFO, "Starting worker...");
        logWithLogger();

        System.out.println("=================");
        logWithPrintln();

        logger.log(Level.INFO, "Finishing worker...");
    }
    
    public static void main(String[] args) {
        System.out.println("### running with Level.ALL #######################");
        logger.setLevel(Level.ALL);
        worker();
        
        System.out.println("\n### running with Level.WARNING #######################");
        logger.setLevel(Level.WARNING);
        worker();
   }
}
