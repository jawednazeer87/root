package org.jn.core.java.student.arsallan.shahab.datatype.weekly.assignment2;

public class IfElseTwo {

	public static void main(String[] args) {
		int a = 79,b=76,c=73;
		if(a>b) {
			if(a>c) {
				System.out.println("a is greatest");
			}else if(b<c) {
				System.out.println("c is greatest");
			}
		}else if (b > c) {
			if(b>a) {
				System.out.println("b is greatest");
			}else if( b < a) {
				System.out.println("a is greatest");
			}
		}else if(c > a) {
			if(c>b) {
				System.out.println("c is greatest");
			}else if(c < b ) {
				System.out.println("b is greatest");
			}
		}
	}

}
