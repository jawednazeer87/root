package org.jn.corejava.student.aameen.forloop;
import java.util.Scanner;
public class Program73 {

	public static void main(String[] args) {
		// Pattern  Increase Star 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows to be printed : ");
		int n = sc.nextInt();
		for(int i =1;i<=n;i++)
		{
			for(int j =1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("   ");
		}
		
		
	}

}
