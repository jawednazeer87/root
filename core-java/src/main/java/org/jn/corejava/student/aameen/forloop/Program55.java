package org.jn.corejava.student.aameen.forloop;
import java.util.Scanner;
public class Program55 {

	public static void main(String[] args) {
		// Wap to count number of digits in a number.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int count=0;
		for(;num!=0;num=num/10,count++)
		{
			
		}
		System.out.println("No of digit in the given number is : "+count);
		
	

	}

}
