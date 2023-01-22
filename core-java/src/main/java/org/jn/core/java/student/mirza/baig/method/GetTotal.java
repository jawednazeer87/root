package org.jn.core.java.student.mirza.baig.method;

import java.util.Scanner;

public class GetTotal {
	
	
	public static int getTotal(int number1, int number2) {

		Scanner console = new Scanner(System.in);
		
		System.out.println("Enter num2");
		
		number1=console.nextInt();
		
		System.out.println("Enter num2");
		
		number2=console.nextInt();
	
	int sum=number1+number2;
	
	System.out.println("sum"+sum);
	
	
		
		return sum;
	 }	
	
public static void main(String[] args) {
		// TODO Auto-generated method stub



getTotal(0,0);
	
	}

}
