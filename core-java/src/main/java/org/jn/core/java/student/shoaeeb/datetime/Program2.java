package org.jn.core.java.student.shoaeeb.datetime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		String format = "dd-MM-yyyy";
		SimpleDateFormat DateFormat = new SimpleDateFormat(format);
		String dateToday = DateFormat.format(date);
		System.out.println(dateToday);
	}

}
