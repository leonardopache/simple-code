package com.javacode.utils;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Logger;

import org.joda.time.DateTime;
import org.joda.time.Days;

/**
 * 
 * @author lpache
 *
 */
public class DayCount {

	private static final String JU_START = "15/05/2017";
	private static final String LEO_START = "01/06/2017";
	private static final String DMY_FORMATTER = "dd/MM/yyyy";
	private static final Logger LOG = Logger.getLogger(DayCount.class.getName());

	public DayCount() {
		throw new InstantiationError("Utility class, do not instantiate!!!");
	}

	public static int countDays(Calendar beginning, Calendar ending) {
		return ending.get(Calendar.DAY_OF_YEAR) - beginning.get(Calendar.DAY_OF_YEAR);
	}

	public static void main(String[] args) throws IOException {
		int leoDays = newCountDays(newCalendar(LEO_START).getTimeInMillis(), Calendar.getInstance().getTimeInMillis());
		int juDays = newCountDays(newCalendar(JU_START).getTimeInMillis(), Calendar.getInstance().getTimeInMillis());
		LOG.info("Leo days: "+ leoDays);
		LOG.info("Jú days: "+ juDays);
	}
	
	private static int newCountDays(long startTime, long timeNow) {
		Days days = Days.daysBetween(new DateTime(startTime), new DateTime(timeNow));
		return days.getDays();
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
