package org.la.corejava.student.aameen.forloop;
import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		// wap to print fibonocci series
		int n1=0,n2=1,n3;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of fibonacci series to be counted ");
		int count = sc.nextInt();
		System.out.println("Fibonacci Series");
		System.out.println(n1+ " ; " +n2);
		
		for(int i =1;i<=count;i++)
		{
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}
		
		
		

	}

}
