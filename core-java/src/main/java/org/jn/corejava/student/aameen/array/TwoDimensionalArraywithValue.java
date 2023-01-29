package org.jn.corejava.student.aameen.array;

public class TwoDimensionalArraywithValue {

	public static void main(String[] args) {
		// Two dimensional array with value 
		
		int a [][] = {{1,2,3},{11,12,13},{21,22,23},{31,32,33}};
		
		printarray(a);
		
	}	
			static void printarray(int b[][])
			{
				for(int r=0;r<b.length;r++)
				{
					for(int c=0;c<b[r].length;c++ )
					{
						System.out.print("b ["+r+"] ["+c+"] = "+b[r][c]+" ,");
					}
					System.out.println("");
				}
			}

}
