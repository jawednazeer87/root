package org.jn.corejava.student.aameen.forloop;
import java.util.Scanner;
public class program61 {
	public static void main(String[] args)
	{//Wap to calculate sum of digits of a number
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num : ");
		int num= sc.nextInt();
		int digit, sum = 0 ;
		for(;num!=0;num=num/10)
		{
			digit = num%10;
			sum=sum+ digit ;
			
		}
		System.out.println("Sum of the digit of a number :  "+sum);
		
		
		
	}
}
