package org.jn.corejava.student.aameen.forloop;
import java.util.Scanner;
public class Program70 {

	public static void main(String[] args) {
		//Wap to check whether a number is Perfect number or not
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num : ");
		long num=sc.nextInt();
		long sum =0;
		for(int i =1;i<=num/2;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		if(num==sum)
			System.out.println(num+" : is a perfect number ");
		else
			System.out.println(num+" : is a not perfect number ");

	}

}
