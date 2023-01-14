package org.la.corejava.student.aameen.forloop;
import java.util.Scanner;
public class Program71 {

	public static void main(String[] args) {
		// Wap to check whether a number is Armstrong number or not
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = sc.nextInt();
		int d=num;
		int arm =0, rem;
		while(num>0)
		{
			rem=num%10;
			arm=arm+rem*rem*rem;
			num=num/10;
		}
		System.out.println("arm : "+arm);
		
		if(arm==d)
			System.out.println("Armstrong ");
		else
			System.out.println("Not armstrong ");
	}

}
