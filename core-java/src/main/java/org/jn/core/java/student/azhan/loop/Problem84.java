package org.jn.core.java.student.azhan.loop;

public class Problem84 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 3;
		for(int i=1; i<=row; i++)
		{
			for(int k=1; k<=row-i; k++)
				System.out.print("  ");
			for(int j=1; j<=i; j++)
				System.out.print(j+" ");
			System.out.println();
		} 
	}

}