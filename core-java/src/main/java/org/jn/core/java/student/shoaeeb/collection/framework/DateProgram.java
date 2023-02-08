package org.jn.core.java.student.shoaeeb.collection.framework;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d =new Date();
		DateFormat fmt = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.SHORT,Locale.UK);
		String str = fmt.format(d);
		System.out.println(str);
		
	}

}
