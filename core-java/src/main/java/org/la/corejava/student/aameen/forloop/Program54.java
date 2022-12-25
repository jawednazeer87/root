package org.la.corejava.student.aameen.forloop;
import java.util.Scanner;
public class Program54 {

	public static void main(String[] args) {
		// Wap to print multiplication table of any number.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number  to get multiplication : " );
		int num =sc.nextInt();
		
		for(int i = 1;i<=10;i++)
		{
			System.out.println(num + " * " +i+ " = " +(num*i));
		}

	}

}
