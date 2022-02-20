package org.la.core.java.student.arfaz.assignment_11_Inheritance;

/*11.	Create a parent class having 1 default constructor, create a child class which is also having default constructor.
		create again a child class of child class which having again default constructor.
		create object of child class in a main method and observe behavior.
*/
public class PareSub11 extends Pare11 {
	public PareSub11()  {
		
	}
	protected void print() {
		super.display();
}
	
	public void display() {
		System.out.println("child");
	}
	
}
