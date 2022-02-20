package org.la.core.java.student.arfaz.assignment_11_Inheritance;

/*	09.	Create a parent class having 2 methods,  protected void print(), void display(), create a child class which
		which will override parent methods and will call parent methods using super keyword.
*/
public class PareSub0 extends Pare9 {
	protected void print() {
		super.display();
}
	
	public void display() {
		System.out.println("child");
	}
	
}
