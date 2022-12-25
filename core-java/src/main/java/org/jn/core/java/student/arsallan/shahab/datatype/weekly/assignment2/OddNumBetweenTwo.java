package org.jn.core.java.student.arsallan.shahab.datatype.weekly.assignment2;

public class OddNumBetweenTwo {

	public static void main(String[] args) {
		int a = 45, b= 66;
		if( a % 2 == 0  && b % 2 == 0) {
			System.out.println("none of them is odd");
		}else {
			if(a % 2 != 0) {
				System.out.println("a is odd");
			}
			if ( b % 2 != 0) {
				System.out.println("b is odd");
			}
		}
	}

}
