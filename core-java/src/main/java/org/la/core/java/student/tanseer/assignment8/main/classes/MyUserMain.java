package org.la.core.java.student.tanseer.assignment8.main.classes;

import org.la.core.java.student.tanseer.assignment8.classes.MyUser;

public class MyUserMain 
{
	public static void main(String[] args) 
	{
		
		MyUser user2 = new MyUser();
		user2.setNum(12);
		user2.setName("Tanseer");
		user2.setGender("Male");
		user2.printData();
		
		MyUser user = new MyUser();
		user.setNum(11);
		user.setName("Ahmed");
		user.setGender("Male");
		user.printData();
	}
}
