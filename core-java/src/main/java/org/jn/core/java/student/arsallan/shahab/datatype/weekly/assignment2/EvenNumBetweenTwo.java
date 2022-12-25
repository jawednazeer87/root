package org.jn.core.java.student.arsallan.shahab.datatype.weekly.assignment2;

public class EvenNumBetweenTwo {
	public static void main(String[] args) {
		int a = 44, b= 56;
		
		if( a % 2 != 0  && b % 2 != 0) {
			System.out.println("none of them is even");
		}else {
			if(a % 2 == 0) {
				System.out.println("a is even");
			}
			if ( b % 2 == 0) {
				System.out.println("b is even");
			}
		}
	}
}
