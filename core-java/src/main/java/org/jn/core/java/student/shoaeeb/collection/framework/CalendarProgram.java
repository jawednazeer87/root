package org.jn.core.java.student.shoaeeb.collection.framework;

import java.util.Calendar;

public class CalendarProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c1 = Calendar.getInstance();
		System.out.println("Calendar Date");
		int dd = c1.get(Calendar.DATE);
		int mm= c1.get(Calendar.MONTH);
		mm++;
		int yy=c1.get(Calendar.YEAR);
		System.out.println(dd+"-"+mm+"-"+yy);
		
	}

}
