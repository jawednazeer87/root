package org.jn.core.java.student.shoaeeb.arrays;

public class SpiralOrderPrint {
	static void spiralOrderPrint(int arr[][])
	{
		int rowEnd=arr.length-1;
		int colEnd=arr[0].length-1;
		int row=0;
		int rowStart=0;
		int colStart=0;
		int col=0;
		while(rowStart<=rowEnd && colStart<=colEnd)
		{
			for(col=colStart; col<=colEnd; col++)
			{
				System.out.print(arr[rowStart][col]);
			}
			rowStart++;
			for(row=rowStart; row<=rowEnd; row++)
			{
				System.out.print(arr[row][colEnd]);
			}
			colEnd--;
			for(col=colEnd; col>=colStart; col--)
			{
				System.out.print(arr[rowEnd][col]);
			}
			rowEnd--;
			for(row=rowEnd; row>=rowStart; row--)
			{
				System.out.print(arr[row][colStart]);
			}
			colStart++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		spiralOrderPrint(arr);
	}

}
