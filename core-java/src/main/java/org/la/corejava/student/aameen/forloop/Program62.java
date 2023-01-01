package org.la.corejava.student.aameen.forloop;
import java.util.Scanner;
public class Program62 {

	public static void main(String[] args) {
		// Wap to enter a number and print its reverse.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be reversed : ");
		int num=sc.nextInt();
		int reverse = 0;
		for(;num!=0;num=num/10)
		{
			int rem = num%10;
			 reverse = reverse*10+rem;
		} 
		System.out.println("Reverse of the given number : "+reverse);

	}

}
