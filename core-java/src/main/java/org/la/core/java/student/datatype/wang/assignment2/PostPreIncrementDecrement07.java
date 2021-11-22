package org.la.core.java.student.datatype.wang.assignment2;

public class PostPreIncrementDecrement07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//7.	Repeat all above operations with decrement operators too.
		/*
		 * 1.	wap to do pre increment a number and assign its value to other number and print both number
	2.	wap to do post increment a number and assign its value to other number and print both number
	
	3.	wap to do pre increment a number and assign its value to other number and print both numbers, do assignment increment in same line
	4.	wap to do post increment a number and assign its value to other number and print both numbers, do assignment increment in same line
	
	5.	wap to pre increment a number n multiply with a number and assign product to a variable, print both variables
	6.	wap to post increment a number n multiply with a number and assign product to a variable, print both variables
	
		 */
		//1:
		int a =10, b=--a;
		System.out.println("a = "+ a+" b = "+ b);
		//2:
		int d=a--;
		System.out.println("a = "+ a+" d = "+ d);
		//3:
		int e=--a;
		System.out.println("a = "+ a+" e = "+ e);
		//4:
		int f=a--;
		System.out.println("a = "+ a+" f = "+ f);
		//5:
		int g = --a * 10;
		System.out.println("a = " + a + " g = " + g);
		//6:
		int h = a-- * 10;
		System.out.println("a = " + a + " h = " + h);
		
		
	}

}
