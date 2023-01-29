package org.jn.corejava.student.aameen.forloop;
import java.util.Scanner;
public class Program74 {

	public static void main(String[] args) {
		// Pattern printing decreasing star 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		
		for(int i = 1;i<=num;i++)
		{
			for(int j=0;j<=num-i;j++ )
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

}
