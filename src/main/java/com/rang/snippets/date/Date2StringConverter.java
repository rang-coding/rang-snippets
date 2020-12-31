package com.rang.snippets.date;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * This class contains multiple examples of conversions from {@link Date} and java.time-Objects introduced with Java 1.8
 * to {@link String}.
 */
public class Date2StringConverter {

    /**
     * Converts {@link Date} to {@link LocalTime}. All date information will be discarded in the process.
     */

    /**
     * Converts {@link LocalTime} to {@link String} using ISO-8601 format.
     */
    public static String asString(LocalTime lt) {
        return DateTimeFormatter.ISO_LOCAL_TIME.format(lt);
    }

    /**
     * Converts {@link LocalTime} to {@link String} using the given format-pattern.
     */
    public static String asString(LocalTime lt, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return formatter.format(lt);
    }

    /**
     * Converts {@link LocalDate} to {@link String} using ISO-8601 format.
     */
    public static String asString(LocalDate ld) {
        return DateTimeFormatter.ISO_LOCAL_DATE.format(ld);
    }

    /**
     * Converts {@link LocalDate} to {@link String} using the given format-pattern.
     */
    public static String asString(LocalDate ld, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return formatter.format(ld);
    }

    /**
     * Converts {@link LocalDateTime} to {@link String} using ISO-8601 format.
     */
    public static String asString(LocalDateTime ldt) {
        return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(ldt);
    }

    /**
     * Converts {@link LocalDateTime} to {@link String} using the given format-pattern.
     */
    public static String asString(LocalDateTime ldt, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return formatter.format(ldt);
    }

    /**
     * Converts {@link ZonedDateTime} to {@link String} using ISO-8601 format.
     */
    public static String asString(ZonedDateTime zdt) {
        return DateTimeFormatter.ISO_ZONED_DATE_TIME.format(zdt);
    }

    /**
     * Converts {@link ZonedDateTime} to {@link String} using the given format-pattern.
     */
    public static String asString(ZonedDateTime zdt, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return formatter.format(zdt);
    }

    /**
     * Converts {@link Date} to {@link String} using format-pattern 'yyyy-MM-dd'.
     */
    public static String asString(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        return formatter.format(date);
    }

    /**
     * Converts {@link Date} to {@link String} using the given format-pattern.
     */
    public static String asString(Date date, String pattern) {
        SimpleDateFormat formatter = new SimpleDateFormat(pattern);
        return formatter.format(date);
    }

    /**
     * Converts {@link java.sql.Date} to {@link String} using format-pattern 'yyyy-MM-dd'.
     */
    public static String asString(java.sql.Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        return formatter.format(date);
    }

    /**
     * Converts {@link java.sql.Date} to {@link String} the given format-pattern.
     */
    public static String asString(java.sql.Date date, String pattern) {
        SimpleDateFormat formatter = new SimpleDateFormat(pattern);
        return formatter.format(date);
    }

    /**
     * Runner demonstrating usage of above methods.
     *
     * @param args unused
     */
    public static void main(String[] args) {

        // LocalTime
        LocalTime lt = LocalTime.now();
        System.out.println("LocalTime");
        System.out.println("ISO-8601: " + asString(lt));
        System.out.println("hh:mm a:  " + asString(lt, "hh:mm a"));

        // LocalData
        LocalDate ld = LocalDate.now();
        System.out.println();
        System.out.println("LocalDate");
        System.out.println("ISO-8601:   " + asString(ld));
        System.out.println("MM/dd/yyyy: " + asString(ld, "MM/dd/yyyy"));

        // LocalDateTime
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println();
        System.out.println("LocalDateTime");
        System.out.println("ISO-8601:           " + asString(ldt));
        System.out.println("MM/dd/yyyy hh:mm a: " + asString(ldt, "MM/dd/yyyy hh:mm a"));

        // LocalDateTime
        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println();
        System.out.println("ZonedDateTime");
        System.out.println("ISO-8601:             " + asString(zdt));
        System.out.println("MM/dd/yyyy hh:mm a z: " + asString(zdt, "MM/dd/yyyy hh:mm a z"));

        // Date
        Date date = new Date();
        System.out.println();
        System.out.println("Date");
        System.out.println("yyyy-MM-dd:         " + asString(date));
        System.out.println("MM/dd/yyyy hh:mm a: " + asString(date, "MM/dd/yyyy hh:mm a"));

        // sqlDate
        java.sql.Date sqlDate = java.sql.Date.valueOf(ld);
        System.out.println();
        System.out.println("sqlDate");
        System.out.println("yyyy-MM-dd: " + asString(sqlDate));
        System.out.println("MM/dd/yyyy: " + asString(sqlDate, "MM/dd/yyyy"));

    }
}
