package org.la.core.java.student.meenah.inhertance;

public class SmartMobile extends Mobile{
	
	public void keyboard() {
		display(); //extends from Mobile class
		System.out.println("No keyboard, it is touch screen Mobile");
	}

}
