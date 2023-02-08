package org.jn.core.java.student.shoaeeb.collection.framework;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Date dNow = new Date( );
	      SimpleDateFormat ft =   new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

	      System.out.println("Current Date: " + ft.format(dNow));
	}

}
