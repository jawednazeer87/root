package org.jn.core.java.student.mirza.baig.ternary;

public class AmongTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =10;
		
		int b= 11 , largest;
		
		largest= (a < b) ? a : b;
		 
		
		System.out.println( "smallest number between a and b is : " +largest);
		
		if (a<b) {
			
			System.out.println("a is smallest number between and b is : "+a);
		}
		else {
			
			System.out.println("b is smallest number between and b is : "+b);
		}

	}

}

//wap to print smallest number among two given numbers( with if and without if)