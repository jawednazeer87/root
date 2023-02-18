package org.jn.core.java.student.shoaeeb.datetime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Program3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	 System.out.println("Enter date in format: yyyy-MM-dd");
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 String date=br.readLine();
	 LocalDate dateNow=LocalDate.parse(date,DateTimeFormatter.ISO_DATE);
	 System.out.println(dateNow);
	}

}
