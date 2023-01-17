package org.la.corejava.student.aameen.array;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// Two Dimensional Array
		
		int a[][]=new int[3][3];
		printarray(a);
	}
	static void printarray(int b[][])
	{
		for(int r =0;r<b.length;r++)
		{
			for(int c=0;c<b[r].length;c++)
			{
				System.out.print("b ["+r+"] ["+c+"] = "+b[r][c]+" , ");
			}
			System.out.println("");
		}
	}

}
