package org.la.core.java.student.operators.unary.majeed;

public class UnaryProgram7 {

	public static void main(String[] args) {
		/*Repeat all above operations with decrement operators too.
		 */
		//1. wap to do pre decrement a number and assign its value to other number and print both number
				int i = 10, j;
				j = --i;
				System.out.println("i value is: "+i);
				System.out.println("j value is: "+j);
				
		//2. wap to do post decrement a number and assign its value to other number and print both number
				int k = i--;
				System.out.println("i value is: "+i);
				System.out.println("k value is: "+k);
				
		/*3. wap to do pre decrement a number and assign its value to other number and print both numbers, 
		 * do assignment decrement in same line
		 */
				int l= --i;
				System.out.println("i value is: "+i);
				System.out.println("l value is: "+l);	
			
		/*4. wap to do post decrement a number and assign its value to other number and print both numbers, 
		 * do assignment decrement in same line
		 */
				int m= i--;
				System.out.println("i value is: "+i);
				System.out.println("m value is: "+m);	
				
		/*5. wap to pre decrement a number n multiply with a number and assign product to a variable, 
		 * print both variables
		 */
				int n = --i * 20;
				System.out.println("i value is: "+i);
				System.out.println("n value is: "+n);
				
		/*6. wap to post decrement a number n multiply with a number and assign product to a variable, 
		 * print both variables
		 */
				int p = i-- * 20;
				System.out.println("i value is: "+i);
				System.out.println("p value is: "+p);				
	}

}
