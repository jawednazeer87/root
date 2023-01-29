package org.jn.corejava.student.aameen.forloop;
import java.util.Scanner;
public class Program58 {

	public static void main(String[] args) {
		// Wap to swap first and last digits of a number.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int lastdigit = num%10;
		System.out.println("last digit is : "+lastdigit);
		int firstdigit=0;
		while(num!=0)
		{
			 firstdigit = num%10;
			num = num/10;
		}
		System.out.println("Firstdigit : "+firstdigit);
		
		
	int swap ;
		swap =	firstdigit;
	firstdigit = lastdigit ;
	lastdigit = swap;
	System.out.println("After swaping firstdigit is : "+firstdigit);
	System.out.println("After swaping lastdigit is : "+lastdigit);


	}

}
