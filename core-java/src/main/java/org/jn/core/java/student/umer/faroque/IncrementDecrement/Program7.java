/**
 * 
 */
package org.jn.core.java.student.umer.faroque.IncrementDecrement;

/**
 * @author umerf
 *
 */
public class Program7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Repeat Program1-7 operations with decrement operators
		
		//pre increment a number and assign its value to other number and print both number
		int a= 5;	
		int b=--a;
		System.out.println("a: "+a+" b: "+b);	// 4  4
		
		
		//post increment a number and assign its value to other number and print both number
		int c= 5;	
		int d=a--;
		System.out.println("c: "+c+" d: "+d);	// 5  4
		
		
		//wap to pre increment a number n multiply with a number and assign product to a variable,
		//print both variables
		int e = 6;
		int f=--e*5;
		System.out.println("e: "+e+" f: "+f);	// 5  25
		
		// wap to post increment a number n multiply with a number and assign product to a variable,
		//print both variables
		int x = 6;
		int y=x--*5;
		System.out.println("x: "+x+" y: "+y);	// 5  30
	}

}
