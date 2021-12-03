package org.la.core.java.student.mdfarman.operators.assignment2;

public class PostPreIncrementDecrementQuestion7 {

	public static void main(String[] args) {
		
//			7.	Repeat all above operations with decrement operators too.

		//		1.	wap to do pre decrement a number and assign its value to other number and print both number
		int num1 = 5;
		int otherNumber1 = --num1;
		System.out.println("Number : "+num1+" \tOther Number : "+otherNumber1);

		
		//		2.	wap to do post decrement a number and assign its value to other number and print both number
		int num2 = 5;
		int otherNumber2 = num2--;
		System.out.println("Number : "+num2+" \tOther Number : "+otherNumber2);

		
		//		3.	wap to do pre decrement a number and assign its value to other number 
		//		and print both numbers, do assignment decrement in same line
		int num3 = 5 , otherNumber3 = --num3;
		System.out.println("Number : "+num3+" \tOther Number : "+otherNumber3);

		
		//	4.	wap to do post decrement a number and assign its value to other number
		//	and print both numbers, do assignment decrement in same line
		int num4 = 5 , otherNumber4 = num4--;
		System.out.println("Number : "+num4+" \tOther Number : "+otherNumber4);

		
		//		5.	wap to pre decrement a number n multiply with a number and assign
		//			product to a variable, print both variables
		int num5 = 5 , otherNumber5 = --num5 * 2;
		System.out.println("Number : "+num5+" \tOther Number : "+otherNumber5);
		
		
		//		6.	wap to post decrement a number n multiply with a number and assign 
		//	product to a variable, print both variables
		int num6 = 5 , otherNumber6 = num6-- * 2;
		System.out.println("Number : "+num6+" \tOther Number : "+otherNumber6);

	
	


	}

}
