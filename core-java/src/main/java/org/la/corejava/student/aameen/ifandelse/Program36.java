package org.la.corejava.student.aameen.ifandelse;
import java.util.Scanner;
public class Program36 {

	public static void main(String[] args) {
		// wap to check whether number is less than 100 or not
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value : ");
		int num=sc.nextInt();
		if(num>=100)
			System.out.println("Number is not lesser than 100");
		else
			System.out.println("Number is lesser than 100 ");

	}

}
