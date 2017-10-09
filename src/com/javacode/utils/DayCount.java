package com.javacode.utils;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * 
 * @author lpache
 *
 */
public class DayCount {

	private static final String DMY_FORMATTER = "dd/MM/yyyy";

	public DayCount() {
		throw new InstantiationError("Utility class, do not instantiate!!!");
	}

	public static int countDays(Calendar beginning, Calendar ending) {
		return ending.get(Calendar.DAY_OF_YEAR) - beginning.get(Calendar.DAY_OF_YEAR);
	}

	public static void main(String[] args) throws IOException {
		System.out.println("Leo days: " + countDays(newCalendar("01/06/2017"), Calendar.getInstance()));
		System.out.println("Jú days: " + countDays(newCalendar("15/05/2017"), Calendar.getInstance()));
	}
	
	private static Calendar newCalendar(String date) {
		Calendar begin = Calendar.getInstance();
		begin.setTimeInMillis(dateTimeFormatter(date, DMY_FORMATTER));
		return begin;
	}

	private static Long dateTimeFormatter(String date, String pattern) {
		SimpleDateFormat dateFormatter = new SimpleDateFormat(pattern);
		try {
			return dateFormatter.parse(date).getTime();
		} catch (ParseException e) {
			return null;
		}
	}
}
