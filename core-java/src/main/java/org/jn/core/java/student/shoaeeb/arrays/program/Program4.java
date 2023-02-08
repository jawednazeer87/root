package org.jn.core.java.student.shoaeeb.arrays.program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program4 {
	//matrix
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter row: ");
		int row=Integer.parseInt(br.readLine());
		System.out.println("Enter col: ");
		int col=Integer.parseInt(br.readLine());
		
		//create array
		int arr[][] = new int[row][col];
		
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				arr[i][j]=Integer.parseInt(br.readLine());
			}
		}
		
		for(int ele[]: arr)
		{
			for(int element: ele)
			{
				System.out.print(element);
			}
			System.out.println();
		}
	}

}
