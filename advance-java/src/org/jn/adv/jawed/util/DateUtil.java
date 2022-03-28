package org.jn.adv.jawed.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author jawednazeer
 */
public class DateUtil {
	
	public static LocalDate stringToLocalDate(String format, String dobString) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
		LocalDate dob = null;
		try {
			dob = LocalDate.parse(dobString, formatter);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dob;
	}
	
	public static String localDateToString(String format, LocalDate date) {
		return date.format(DateTimeFormatter.ofPattern(format));
	}
}
