package org.jn.core.java.student.shoaeeb.arrays;

public class SpiralMatrixII {

	static void spiralOrderPrint(int arr[][])
	{
		int row=0,rowStart=0;;
		int col=0,colStart=0;
		int rowEnd=arr.length-1;
		int colEnd=arr[0].length-1;
		while(row<=rowEnd)
		{
			for(col=0; col<=colEnd; col++)
			{
				System.out.print(arr[row][col]);
			}
			row++;

		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{1,2,3},{8,9,4},{7,6,5}};
		spiralOrderPrint(arr);
	}

}
