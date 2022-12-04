package org.la.corejava.student.aameen.forloop;
import java.util.Scanner;
public class SumoftheGivenNumber {

	public static void main(String[] args) {
		// wap to find sum of a number
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num =sc.nextInt();
		for(;num>0;)
		{
			int digit=num%10;
			sum=sum+digit;
			num=num/10;
			
		}
		System.out.println("Sum of thre digit of the number is : "+sum);

	}

}
