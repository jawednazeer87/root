package org.la.corejava.student.aameen.ifandelse;
import java.util.Scanner;
public class Prorgam40 {

	public static void main(String[] args) {
		//  wap to print double if number is a double digit
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value ");
		int num = sc.nextInt();
		if(num >=10)
			System.out.println("Double ");
		else
		System.out.println("Not a double digit ");

	}

}
