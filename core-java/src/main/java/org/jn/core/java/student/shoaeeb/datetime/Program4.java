package org.jn.core.java.student.shoaeeb.datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String stringdate = "15-Feb-2023";
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		LocalDate date = LocalDate.parse(stringdate, format);
		System.out.println(date);
	}

}
