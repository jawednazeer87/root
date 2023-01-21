package org.jn.core.java.student.shoaeeb.practice;

public class CourseFees {
	public static Fees getFees(String course)
	{
		if(course.equalsIgnoreCase("CSE"))
		{
			return new CSE();
		}
		else if(course.equalsIgnoreCase("ECE"))
		{
			return new ECE();
		}
		else 
			return null;
	}
}
