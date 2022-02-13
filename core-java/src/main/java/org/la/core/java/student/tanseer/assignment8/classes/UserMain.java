package org.la.core.java.student.tanseer.assignment8.classes;

import java.util.Calendar;

public class UserMain
{
	public static void main(String[] args) 
	{
		Calendar cal = Calendar.getInstance();
		cal.set(1998, 5, 17);
		Users users = new Users();
		users.setId(12);
		users.setFullName("Tanseer");
		users.setEmail("ahmed@Gmail.com");
		users.setGender("Male");
		users.setDob(cal.getTime());
		users.setCountryCode(560051);
		users.setCreatedAt("Bangalore");
		users.display();
	}
}
