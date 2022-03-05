package org.la.core.java.student.tanseer.assignment9.inheritance.parent;
/*
 * 09.	Create a parent class having 2 methods,  protected void print(), void display(), 
 * create a child class which will override parent methods and will call parent methods using 
 * super keyword.
 */
public class SuperClass 
{
	 protected void print()
	 {
		 System.out.println("protected print method of parent class ");
	 }
	 
	 public void display()
	 {
		 System.out.println("public print method of parent class ");
	 }
}
