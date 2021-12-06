package org.la.core.java.student.sjmohammed.assignment3;

public class Example10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mark=35;
		if (mark<25) {
			System.out.println("Fail");
		}
		else if(mark>25 && mark <45) {
			System.out.println("E Grade");
		}
		else if(mark>=45 && mark <50) {
			System.out.println("D Grade");
		}
		else if(mark>=50 && mark <60) {
			System.out.println("C Grade");
		}
		else if(mark>=60 && mark <80) {
			System.out.println("B Grade");
		}
		else if(mark>=80) {
			System.out.println("A Grade");
		}
	}

}
