package com.javacode.utils;

import java.io.IOException;
import java.util.Calendar;

/**
 * 
 * @author lpache
 *
 */
public class DayCount {
	
	public DayCount(){
		throw new InstantiationError("Utility class, do not instantiate!!!");
	}

	public static int countDays(Calendar beginning, Calendar ending) {
		return ending.get(Calendar.DAY_OF_YEAR) - beginning.get(Calendar.DAY_OF_YEAR);
	}

	public static void main(String[] args) throws IOException {

		System.out.println("Leo days: "+countDays(leoBegin(), Calendar.getInstance()));
		System.out.println("Jú days: "+countDays(juBegin(), Calendar.getInstance()));
		
	}

	private static Calendar leoBegin() {
		Calendar begin = Calendar.getInstance();
		begin.set(Calendar.MONTH, 5);
		begin.set(Calendar.DAY_OF_MONTH, 1);
		begin.getTime();
		return begin;
	}
	
	private static Calendar juBegin() {
		Calendar begin = Calendar.getInstance();
		begin.set(Calendar.MONTH, 3);
		begin.set(Calendar.DAY_OF_MONTH, 16);
		begin.getTime();
		return begin;
	}
}
