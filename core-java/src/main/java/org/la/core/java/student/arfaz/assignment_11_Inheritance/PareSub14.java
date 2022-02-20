package org.la.core.java.student.arfaz.assignment_11_Inheritance;

/*		14.	Create a parent class having a method void increaseStar(int) override this method in child class.
		increaseStar will print star in increasing order.*/
public class PareSub14 extends Pare14 {
	public PareSub14()  {
		super.increaseStar(0);
	}
	protected  void increaseStar(int a){
		System.out.println("Child");
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=i;j++) {
			System.out.print("*");

			}
			System.out.println();
		}
		  
		  	
	}
	
	
}
