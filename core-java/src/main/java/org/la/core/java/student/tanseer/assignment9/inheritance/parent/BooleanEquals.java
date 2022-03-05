package org.la.core.java.student.tanseer.assignment9.inheritance.parent;

import java.util.Objects;
/*
 * 16.	Create a parent class having boolean compare(String, String) method, this method
 *  will compare string, if equal returns true else false;	
 */
public class BooleanEquals 
{
	protected static boolean compare1(String a , String b)
	{
		boolean comp = false ;
		System.out.println("Comparing two string "+a+" "+b);
		if(Objects.equals(a, b))
			return true;
		else
			return comp;
		
	}
	
	protected static boolean compare2(String a , String b)
	{
		boolean c = a.equals(b);
		return c;
	}
	
	protected static boolean compare3(String a , String b)
	{
		if(a == b)
			return true;
		return false;
	}
}
