package org.jn.corejava.student.aameen.ifandelse;
import java.util.Scanner;
public class Porgram39 {

	public static void main(String[] args) {
		// wap to print hi if number is zero and by if number is 100
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value ");
		int num = sc.nextInt();
		
		if(num==0)
			System.out.println("hi");
		else if(num==100)
			System.out.println("by");
		else
			System.out.println("It is neither 0 nor 100");
	}

}
