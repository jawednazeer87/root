package org.jn.core.java.student.shoaeeb.arrays;

import java.util.Arrays;

public class GenerateMatrix {

	static int [][] generateMatrix(int n)
	{
		int arr[][] = new int[n][n];
		int rowStart=0;
		int colStart=0;
		int rowEnd=arr.length-1;
		int colEnd = arr[0].length-1;
		int col=0,row=0;
		int index=3;
		int newIndex=0;
		int value=1;
		while(rowStart<=rowEnd && colStart<=colEnd)
		{
			for(col=colStart; col<=colEnd; col++)
			{
//				System.out.print(arr[rowStart][col]);
				arr[rowStart][col]=value;
				value++;
			}
			rowStart++;
			for(row=rowStart; row<=rowEnd; row++)
			{
				//System.out.print(arr[row][colEnd]);
				arr[row][colEnd]=value;
				value++;
				
			}
			colEnd--;
			for(col=colEnd; col>=colStart; col--)
			{
				//System.out.print(arr[rowEnd][col]);
				arr[rowEnd][col]=value;
				value++;
			}
			rowEnd--;
			for(row=rowEnd; row>=rowStart; row--)
			{
				//System.out.print(arr[row][colStart]);
				arr[row][colStart]=value;
				value++;
				
			}
			colStart++;
		}
		
		return arr;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]=generateMatrix(4);
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
