package org.jn.core.java.student.arsallan.shahab.datatype;
import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		System.out.println("enter any of the four to proceed: + - * /");
		
		Scanner Input = new Scanner(System.in);
		
		char InputChar = Input.next().charAt(0);
		
		System.out.println("enter First number: ");
		float InputIntOne = Input.nextFloat();
		
		System.out.println(" enter Second number: ");
		float InputIntTwo = Input.nextFloat();
		
		if(InputChar == '+') {
			 System.out.println(InputIntOne + " + " + InputIntTwo + " = "+(InputIntOne+InputIntTwo) );
		}else	if(InputChar == '-') {
			 System.out.println(InputIntOne + " - " + InputIntTwo + " = "+(InputIntOne-InputIntTwo) );
		}else 	if(InputChar == '*') {
			 System.out.println(InputIntOne + " * " + InputIntTwo + " = "+(InputIntOne*InputIntTwo) );
		}else 	if(InputChar == '/') {
			 System.out.println(InputIntOne + " / " + InputIntTwo + " = "+(InputIntOne/InputIntTwo) );
		}else {
			System.out.println("You entered wrong data");
		}
		
		Input.close();
	}

}
