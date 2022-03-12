package org.la.core.java.student.tanseer.assignment9.inheritance.parent;

public class StringUppercaseMain 
{
	public static void main(String[] args) 
	{
		String s1 = "tanseer ahmed";
		StringUppercase  su = new StringUppercaseChild();
		System.out.println(su.uppercase(s1));

		
//		String s1 = "indian idol";
//		String s2 = s1.toUpperCase();
//		System.out.println(s2);
	}
}
