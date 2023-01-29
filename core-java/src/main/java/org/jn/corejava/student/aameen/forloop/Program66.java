package org.jn.corejava.student.aameen.forloop;
import java.util.Scanner;
public class Program66 {

	public static void main(String[] args) {
		//Wap to calculate factorial of a number.
		int fact =1 ; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=sc.nextInt();
		for(int i =0;i<num;num--)
		{
			fact = fact*num;
			
			System.out.println(num);
		}
		System.out.println("Factorial of a given number  :" +fact);
	}

}
