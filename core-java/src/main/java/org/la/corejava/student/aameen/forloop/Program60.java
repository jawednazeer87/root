package org.la.corejava.student.aameen.forloop;
import java.util.Scanner;
public class Program60 {
	public static void main(String[]args)
	{			//Wap to calculate product of digits of a number.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = sc.nextInt();
		int digit;
		int product =1 ;
		
		while(num!=0){
			digit = num%10;
			product = product *digit ;
			num=num/10;
		}
		System.out.println("Product of digit of a number : "+product);
		
		
	}
}
