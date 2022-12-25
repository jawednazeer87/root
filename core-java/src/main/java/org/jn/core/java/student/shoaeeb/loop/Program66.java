package org.jn.core.java.student.shoaeeb.loop;
import java.util.Scanner;
public class Program66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,rem,sum=0,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:\n");
		num = sc.nextInt();
		for(i=1; i<num; i++)
		{
			rem=num%i;
			if(rem==0)
			{
				sum=sum+i;
			}
		}
		if(sum==num)
		{
			System.out.println(num+"is a perfect Number");
		}
		else {
			System.out.println(num+" is not a perfect number");
		}
	}

}
