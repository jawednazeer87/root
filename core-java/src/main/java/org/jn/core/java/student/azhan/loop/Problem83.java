package org.jn.core.java.student.azhan.loop;

public class Problem83 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 3;
		for(int i=1; i<=row; i++)
		{
			for(int j=1; j<=i; j++)
				System.out.print(i+" ");
			System.out.println();
		}
	}

}