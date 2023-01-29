package org.jn.core.java.student.shoaeeb.arrays;

import java.util.Arrays;

public class MatrixRotation {
	
	static boolean matrixRotation(int mat[][],int target[][])
	{
		int sum=0,sumT=0;
		for(int i=0; i<mat.length; i++)
		{
			for(int j=0; j<mat[i].length; j++)
			{
				sum+=mat[i][j];
			}
		}
		for(int i=0; i<target.length; i++)
		{
			for(int j=0; j<target[i].length; j++)
			{
				sumT+=target[i][j];
			}
		}
		if(sum==sumT)
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][]= {{0,1},{1,0}};
		int target[][]= {{1,0},{0,1}};
		 System.out.println(matrixRotation(mat,target));
		
	}

}
