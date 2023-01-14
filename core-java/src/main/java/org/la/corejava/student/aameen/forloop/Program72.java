package org.la.corejava.student.aameen.forloop;
import java.util.Scanner;
public class Program72 {

	public static void main(String[] args) {
		// Wap to print Fibonacci series up to n terms. 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n numnber of terms u want Fibonacci series  : ");
		int n =sc.nextInt();
		int num1 = 0, num2 =1;
		int num3;
		System.out.print( num1+" "+num2);
		for(int i = 3; i<=n;i++)
		{
			num3=num1+num2;
			System.out.print(" "+num3);
			num1=num2;
			num2=num3;
		}
	}

}
