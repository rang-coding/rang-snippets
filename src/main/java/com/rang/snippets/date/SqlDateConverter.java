package com.rang.snippets.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * This class contains multiple examples of conversions from {@link java.sql.Date} to {@link Date} and java.time-Objects
 * introduced with Java 1.8 and vice versa.
 */
public class SqlDateConverter {

    /**
     * Converts {@link Date} to {@link java.sql.Date}. All time information will be discarded in the process.
     */
    public static java.sql.Date asSqlDate(Date date) {
        return new java.sql.Date(date.getTime());
    }

    /**
     * Converts {@link LocalDate} to {@link java.sql.Date}.
     */
    public static java.sql.Date asSqlDate(LocalDate ld) {
        return java.sql.Date.valueOf(ld);
    }

    /**
     * Converts {@link LocalDateTime} to {@link java.sql.Date}. All time information will be discarded in the process.
     */
    public static java.sql.Date asSqlDate(LocalDateTime ldt) {
        return java.sql.Date.valueOf(ldt.toLocalDate());
    }

    /**
     * Converts {@link java.sql.Date} to {@link Date}. {@link java.sql.Date} does not contain any time information, so
     * it has to be appended.
     */
    public static Date asDate(java.sql.Date sqlDate) {
        return new Date(sqlDate.getTime());
    }

    /**
     * Converts {@link java.sql.Date} to {@link LocalDate}.
     */
    public static LocalDate asLocalDate(java.sql.Date sqlDate) {
        return sqlDate.toLocalDate();
    }

    /**
     * Converts {@link java.sql.Date} to {@link LocalDateTime}. {@link java.sql.Date} does not contain any time
     * information, so it has to be appended.
     */
    public static LocalDateTime asLocalDateTime(java.sql.Date sqlDate) {
        LocalDate ld = sqlDate.toLocalDate();
        return ld.atStartOfDay();
    }

}
