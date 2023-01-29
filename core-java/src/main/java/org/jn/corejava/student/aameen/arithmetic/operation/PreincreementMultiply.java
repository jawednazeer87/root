package org.jn.corejava.student.aameen.arithmetic.operation;

public class PreincreementMultiply {

	public static void main(String[] args) {
		// wap to pre increment a number n multiply with a number and assign product to a variable, print both variables
		int n = 45;
		System.out.println("Number to be preincreement :"+n);
		System.out.println("---------------------");
		++n; 
		int multi = 2;
		int c = n*multi;
		System.out.println("Number after preincreement n : " +n);
		System.out.println("Multiplying number is : " +multi);

		System.out.println("Variable assign to stored after multipy , c : "+c);
	}

}
