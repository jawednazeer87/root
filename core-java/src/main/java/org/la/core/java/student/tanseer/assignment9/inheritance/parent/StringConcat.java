package org.la.core.java.student.tanseer.assignment9.inheritance.parent;
/*
 * 23.	create a parent class having protected String concat(String, String, String) method, 
 * override concat method in child class which will concat all strings separated by space and
 *  will return new concated string.
 */

public class StringConcat 
{
	protected String concat(String a , String b , String c)
	{
		String concat = a +" "+ b +" "+ c;
		return concat;
	}
}
