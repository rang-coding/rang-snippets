package com.rang.snippets.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * This class contains multiple examples of conversions from {@link String} to {@link Date} and java.time-Objects
 * introduced with Java 1.8.
 */
public class String2DateConverter {

    /**
     * Parses a {@link String} to {@link LocalTime} using {@link DateTimeFormatter.ISO_LOCAL_TIME} as format-pattern.
     */
    public static LocalTime asLocalTime(String timeStr) {
        return LocalTime.parse(timeStr, DateTimeFormatter.ISO_LOCAL_TIME);
    }

    /**
     * Parses a {@link String} to {@link LocalTime} using the given format-pattern.
     */
    public static LocalTime asLocalTime(String timeStr, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return LocalTime.parse(timeStr, formatter);
    }

    /**
     * Parses a {@link String} to {@link LocalDate} using {@link DateTimeFormatter.ISO_LOCAL_DATE} as format-pattern.
     */
    public static LocalDate asLocalDate(String dateStr) {
        return LocalDate.parse(dateStr, DateTimeFormatter.ISO_LOCAL_DATE);
    }

    /**
     * Parses a {@link String} to {@link LocalDate} using the given format-pattern.
     */
    public static LocalDate asLocalDate(String dateStr, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return LocalDate.parse(dateStr, formatter);
    }

    /**
     * Parses a {@link String} to {@link LocalDateTime} using {@link DateTimeFormatter.ISO_LOCAL_DATE_TIME} as
     * format-pattern.
     */
    public static LocalDateTime asLocalDateTime(String dateTimeStr) {
        return LocalDateTime.parse(dateTimeStr, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
    }

    /**
     * Parses a {@link String} to {@link LocalDateTime} using the given format-pattern.
     */
    public static LocalDateTime asLocalDateTime(String dateTimeStr, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return LocalDateTime.parse(dateTimeStr, formatter);
    }

    /**
     * Parses a {@link String} to {@link ZonedDateTime} using {@link DateTimeFormatter.ISO_ZONED_DATE_TIME} as
     * format-pattern.
     */
    public static ZonedDateTime asZonedDateTime(String dateTimeStr) {
        return ZonedDateTime.parse(dateTimeStr, DateTimeFormatter.ISO_ZONED_DATE_TIME);
    }

    /**
     * Parses a {@link String} to {@link ZonedDateTime} using the given format-pattern.
     */
    public static ZonedDateTime asZonedDateTime(String dateTimeStr, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return ZonedDateTime.parse(dateTimeStr, formatter);
    }

    /**
     * Parses a {@link String} to {@link LocalTime} using {@code 'yyyy-MM-dd'} as format-pattern.
     */
    public static Date asDate(String dateStr) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        return formatter.parse(dateStr);
    }

    /**
     * Parses a {@link String} to {@link LocalTime} using the given format-pattern.
     */
    public static Date asDate(String dateStr, String pattern) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat(pattern);
        return formatter.parse(dateStr);
    }

    /**
     * Parses a {@link String} to {@link LocalTime} using {@code 'yyyy-MM-dd'} as format-pattern.
     */
    public static java.sql.Date asSqlDate(String dateStr) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date date = formatter.parse(dateStr);
        return new java.sql.Date(date.getTime());
    }

    public static java.sql.Date asSqlDate(String dateStr, String pattern) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat(pattern);
        Date date = formatter.parse(dateStr);
        return new java.sql.Date(date.getTime());
    }

    /**
     * Runner demonstrating usage of above methods.
     *
     * @param args unused
     */
    public static void main(String[] args) throws Exception {

        // LocalTime
        System.out.println("LocalTime");
        System.out.println("ISO-8601: " + asLocalTime("04:20"));
        System.out.println("ISO-8601: " + asLocalTime("04:20:17"));
        System.out.println("HH:mm:ss: " + asLocalTime("04:20:17", "HH:mm:ss"));

        // LocalDate
        System.out.println();
        System.out.println("LocalDate");
        System.out.println("ISO-8601  : " + asLocalDate("2019-11-17"));
        System.out.println("MM/dd/yyyy: " + asLocalDate("11/17/2019", "MM/dd/yyyy"));

        // LocalDateTime
        System.out.println();
        System.out.println("LocalDateTime");
        System.out.println("ISO-8601:            " + asLocalDateTime("2019-11-17T04:20:17"));
        System.out.println("MM/dd/yyyy HH:mm:ss: " + asLocalDateTime("11/17/2019 04:20:17", "MM/dd/yyyy HH:mm:ss"));

        // ZonedDateTime
        // @formatter:off
        System.out.println();
        System.out.println("LocalDateTime");
        System.out.println("ISO-8601:              " + asZonedDateTime("2019-11-17T04:20:17+01:00[Europe/Paris]"));
        System.out.println("MM/dd/yyyy HH:mm:ss z: " + asZonedDateTime("11/17/2019 04:20:17 EST", "MM/dd/yyyy HH:mm:ss z"));
        // @formatter:on

        // Date
        System.out.println();
        System.out.println("Date");
        System.out.println("yyyy-MM-dd:          " + asDate("2019-11-17"));
        System.out.println("MM/dd/yyyy HH:mm:ss: " + asDate("11/17/2019 04:20:17", "MM/dd/yyyy HH:mm:ss"));

        // SqlDate
        System.out.println();
        System.out.println("SqlDate");
        System.out.println("yyyy-MM-dd:   " + asSqlDate("2019-11-17"));
        System.out.println("MM/dd/yyyy: " + asSqlDate("11/17/2019", "MM/dd/yyyy"));

    }

}
