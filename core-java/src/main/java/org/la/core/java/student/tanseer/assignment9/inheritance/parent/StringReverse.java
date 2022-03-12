package org.la.core.java.student.tanseer.assignment9.inheritance.parent;
/*
 * 20. create a parent class having protected String reverse(String) method, 
 * override reverse method in child class reverse method will reverse and return 
 * reverse string.
 */
public class StringReverse 
{
	// Using iteration
	protected String reverse(String s)
	{
		return s;
	}
	
	// Using String buffer
	protected static String rev(String s)
	{
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		return sb.toString();
	}
}
