package org.jn.corejava.student.aameen.forloop;
import java.util.Scanner;
public class Program63 {

	public static void main(String[] args) {
		// Wap to check whether a number is palindrome or not.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be checked : ");
		int num = sc.nextInt();
		int temp = num , reverse =0;
		for(;num!=0;num=num/10)
		{
			int rem=num%10;
			reverse=reverse*10+rem;
		}
		if(reverse == temp )
			System.out.println("The given number is palindrome : " +temp);
		else
			System.out.println("The given number is not a palindrome : "+temp);
	

	}

}
