package org.la.corejava.student.aameen.ifandelse;
import java.util.Scanner;
public class Multiple {

	public static void main(String[] args) {
		// wap to find a number is multiple of 10 or not
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value : ");
		int num =sc.nextInt();
		if(num%10==0)
		System.out.println("Yes,it is multiple of 10 ");
		else
			System.out.println("No,it is not multiple of 10 ");

	}

}
