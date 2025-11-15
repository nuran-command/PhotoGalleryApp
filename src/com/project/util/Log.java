package com.project.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Log {
    private static final DateTimeFormatter FORMAT =
            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static void info(String message) {
        System.out.println("[INFO " + FORMAT.format(LocalDateTime.now()) + "] " + message);
    }

    public static void error(String message) {
        System.err.println("[ERROR " + FORMAT.format(LocalDateTime.now()) + "] " + message);
    }
}