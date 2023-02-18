package org.jn.core.java.student.shoaeeb.datetime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = Calendar.getInstance().getTime();
		System.out.println(date);
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		String dateNow=format.format(date);
		System.out.println(dateNow);
		
	}

}
