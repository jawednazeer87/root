package org.jn.core.java.student.shoaeeb.dsa;

public class SpiralOrderPrint {
		public void spiralPrintArray(int arr[][],int rowend,int colend)
		{
			int rowStart=0,colStart=0,row,col;
			while(rowStart<=rowend && colStart<=colend)
			{
				for(col=colStart; col<=colend; col++)
				{
					System.out.print(arr[rowStart][col]);
				}
				rowStart++;
				for(row=rowStart; row<=rowend; row++)
				{
					System.out.print(arr[row][colend]);
				}
				colend--;
				for(col=colend; col>=colStart; col--)
				{
					System.out.print(arr[rowend][col]);
				}
				rowend--;
				for(row=rowend; row>=rowStart; row--)
				{
					System.out.print(arr[row][colStart]);
				}
				colStart++;
			}
		}
}
