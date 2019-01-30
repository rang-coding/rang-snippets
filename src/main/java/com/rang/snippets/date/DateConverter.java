package com.rang.snippets.date;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

/**
 * This class contains multiple examples of conversions from {@link Date} to
 * java.time-Objects introduced with Java 1.8 and vice versa.
 */
public class DateConverter {

	/**
	 * Converts {@link Date} to {@link LocalTime}. All date information will be
	 * discarded in the process.
	 */
	public static LocalTime asLocalTime(Date date) {
		Instant instant = date.toInstant();
		ZonedDateTime zdt = instant.atZone(ZoneId.systemDefault());
		return zdt.toLocalTime(); // discards date information
	}

	/**
	 * Converts {@link Date} to {@link LocalDate}. All time information will be
	 * discarded in the process.
	 */
	public static LocalDate asLocalDate(Date date) {
		Instant instant = date.toInstant();
		ZonedDateTime zdt = instant.atZone(ZoneId.systemDefault());
		return zdt.toLocalDate(); // discards time information
	}

	/**
	 * Converts {@link Date} to {@link LocalDateTime}.
	 */
	public static LocalDateTime asLocalDateTime(Date date) {
		Instant instant = date.toInstant();
		ZonedDateTime zdt = instant.atZone(ZoneId.systemDefault());
		return zdt.toLocalDateTime();
	}

	/**
	 * Converts {@link Date} to {@link ZonedDateTime}. {@link Date} does not contain
	 * any timezone information, so it has to be appended.
	 */
	public static ZonedDateTime asZonedDateTime(Date date) {
		Instant instant = date.toInstant();
		return instant.atZone(ZoneId.systemDefault()); // appends timezone information
	}

	/**
	 * Converts {@link LocalTime} to {@link Date}. {@link LocalTime} does not
	 * contain any date information, so it has to be appended.
	 */
	public static Date asDate(LocalTime lt) {
		LocalDateTime ldt = lt.atDate(LocalDate.now()); // appends date information
		ZonedDateTime zdt = ldt.atZone(ZoneId.systemDefault());
		Instant instant = zdt.toInstant();
		return Date.from(instant);
	}

	/**
	 * Converts {@link LocalDate} to {@link Date}. {@link LocalDate} does not
	 * contain any time information, so it has to be appended.
	 */
	public static Date asDate(LocalDate ld) {
		LocalDateTime ldt = ld.atStartOfDay(); // appends time information
		ZonedDateTime zdt = ldt.atZone(ZoneId.systemDefault());
		Instant instant = zdt.toInstant();
		return Date.from(instant);
	}

	/**
	 * Converts {@link LocalDate} and {@link LocalTime} to {@link Date}.
	 */
	public static Date asDate(LocalDate ld, LocalTime lt) {
		LocalDateTime ldt = ld.atTime(lt);
		ZonedDateTime zdt = ldt.atZone(ZoneId.systemDefault());
		Instant instant = zdt.toInstant();
		return Date.from(instant);
	}

	/**
	 * Converts {@link LocalDateTime} to {@link Date}.
	 */
	public static Date asDate(LocalDateTime ldt) {
		ZonedDateTime zdt = ldt.atZone(ZoneId.systemDefault());
		Instant instant = zdt.toInstant();
		return Date.from(instant);
	}

	/**
	 * Converts {@link ZonedDateTime} to {@link Date}. All timezone information will
	 * be discarded in the process.
	 */
	public static Date asDate(ZonedDateTime zdt) {
		Instant instant = zdt.toInstant(); // discards timezone information
		return Date.from(instant);
	}

}