package org.la.core.java.student.tanseer.assignment9.inheritance.parent;
/*
 * 19. Create a parent class having public String remove(String, char) method, create a 
 * child class which will override remove method. remove method will remove char from the 
 * string and will return new string.	
 */
public class StringRemoveChild extends StringRemove
{

	@Override
	public String remove(String s, char c) 
	{
		return s;
	}
}
