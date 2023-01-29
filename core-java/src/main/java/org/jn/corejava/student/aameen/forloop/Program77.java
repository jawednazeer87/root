package org.jn.corejava.student.aameen.forloop;
import java.util.Scanner;
public class Program77 {

	public static void main(String[] args) {
		// Pyramid pattern printing 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		for(int i = 1;i<=num;i++)
		{
			for(int spc = 1;spc<=num-i;spc++)
			{
				System.out.print(" ");
			}
			for(int str =1; str<=i;str++)
			{
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}

}
