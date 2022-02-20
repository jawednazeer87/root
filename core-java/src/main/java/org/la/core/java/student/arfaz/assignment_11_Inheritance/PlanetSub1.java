package org.la.core.java.student.arfaz.assignment_11_Inheritance;

/*03.	Create a Child class Planet having void name() and void distance(int) methods, create 2 child class which will override
both methods of Child class.
*/
public class PlanetSub1 extends Planet{
	
	void read() {
		System.out.println("Child");
	}
	void name() {
		System.out.println("Child");
	}
	
	void distance(int i) {
		System.out.println("Child");
	}
	
}
