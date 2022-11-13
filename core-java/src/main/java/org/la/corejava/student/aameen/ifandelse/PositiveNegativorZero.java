package org.la.corejava.student.aameen.ifandelse;
import java.util.Scanner;
public class PositiveNegativorZero {

	public static void main(String[] args) {
		// wap to find a number is negative or positive or zero
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the value : ");
		int num =sc.nextInt();
		if(num>0)
			System.out.println("Positive number ");
		else if (num<0)
			System.out.println("Negative number ");
		else
			System.out.println("is Equal to Zero");
	}

}
