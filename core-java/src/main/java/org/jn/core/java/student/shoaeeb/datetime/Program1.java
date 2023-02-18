package org.jn.core.java.student.shoaeeb.datetime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		SimpleDateFormat DateFormat = new SimpleDateFormat("dd-MM-yyyy");
		String stringDate = DateFormat.format(date);
		System.out.println(stringDate);
	}

}
