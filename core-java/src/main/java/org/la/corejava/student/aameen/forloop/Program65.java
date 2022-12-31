package org.la.corejava.student.aameen.forloop;
import java.util.Scanner;
public class Program65 {

	public static void main(String[] args) {
		// Wap to find power of a number using for loop.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base : ");
		int base=sc.nextInt();
		System.out.println("Enter the exponent : ");
		int exponent = sc.nextInt();
		int result=1;
		for(;exponent!=0;exponent--)
		{
			result=result*base;
		}
		System.out.println("reult : "+result);
	}

}
