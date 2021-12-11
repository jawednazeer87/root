package org.la.core.java.student.sajid.conditional.assignment3;

public class Wap09 {

	public static void main(String[] args) {
		int length = 10;
		int breadth = 10;
		
		int area = length * breadth;
		int reminder = area%length;
				
		if (reminder == 0) {
			System.out.println("it is a square");
		}else {
			System.out.println("it is not a square");
		}

	}

}
