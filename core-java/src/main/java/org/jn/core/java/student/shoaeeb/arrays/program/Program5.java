package org.jn.core.java.student.shoaeeb.arrays.program;

public class Program5 {
	//transpose
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		for(int ele[]: arr)
		{
			for(int element: ele)
			{
				System.out.print(element+" ");
			}
			System.out.println();
		}
		int row=arr.length;
		int col=arr[0].length;
		
		
		System.out.println("Transpose of the matrix");
		for(int i=0; i<col; i++)
		{
			for(int j=0; j<row; j++)
			{
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
	}

}
