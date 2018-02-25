package ru.javawebinar.topjava.util;

import java.time.LocalTime;
/**
 * AZayats
 * 25.02.2018.
 */
public class TimeUtil {
    public static boolean isBetween(LocalTime lt, LocalTime startTime, LocalTime endTime) {
        return lt.compareTo(startTime) >= 0 && lt.compareTo(endTime) <= 0;
    }
}
