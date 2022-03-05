package org.la.core.java.student.tanseer.assignment9.inheritance.parent;
/*
 * 12.	Create a Parent class having a method 'static void fun()' create a child class 
 * and try to override statice method in child class. create object in main method and 
 * observe the behavior.
 */
public class StaticParent 
{
	 static void fun() 
	{
		final int a;
		a = 50; 
		System.out.println("Static void function of parent class");
		System.out.println("Final int 'a' : "+a);
	}
}
