package org.la.corejava.student.aameen.forloop;

public class Program76 {

	public static void main(String[] args) {
		// Pattern printing decrease from right side 
		int n = 3;
		for(int i = 1;i<=n;i++)
		{
			for(int spc = 1;spc<i;spc++)
			{
				System.out.print(" ");
			}
			for(int str = 0;str<=n-i;str++)
			{
				System.out.print("*");
			}
			System.out.println("");
			}

	}

}
