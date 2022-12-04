package org.jn.core.java.student.azhan.loop;

public class Problem79 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 4;
		for(int i=1; i<=row; i++)
		{
			for(int k=1; k<=row-i; k++)
				System.out.print(" ");
			for(int j=1; j<=i; j++)
				System.out.print("*");
			System.out.println();
		} 
	}

}
