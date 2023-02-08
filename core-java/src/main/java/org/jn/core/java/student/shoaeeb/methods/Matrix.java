package org.jn.core.java.student.shoaeeb.methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Matrix {
	int r;
	 int c;
	
	Matrix(int r,int c)
	{
		this.r=r;
		this.c =c;
	}
	int[][] getMatrix() throws IOException {
		int[][] arr = new int[r][c];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		for(int i=0; i<r; i++)
		{
			String s= br.readLine();
			st=new StringTokenizer(s," ");
			for(int j=0; j<c; j++)
			{
				arr[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		return arr;
	}
	int[][] findsum(int a[][],int b[][]) {
		if(a.length==b.length && a[0].length==b[0].length)
		{
			System.out.println("rows and columns of these two matrix is not same");
			System.exit(0);
		}
		int newArr[][] = new int[a.length][a[0].length];
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[0].length; j++)
			{
				newArr[i][j]=a[i][j]+b[i][j];
			}
		}
		return newArr;
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		int a[][]= {{1,2,3},
//				{4,5,6},
//				{7,8,9}
//		};
//		int b[][] = {{10,11,12},
//				{13,14,15},
//				{16,17,18}
//				};
//		}
		Matrix m = new Matrix(2,2);
		Matrix  s = new Matrix(2,2);
		
		int a[][]=m.getMatrix();
		int b[][] = s.getMatrix();
		int c[][] = m.findsum(a, b);
		
		for(int ele[]: c)
		{
			for(int element: ele)
			{
				System.out.print(element+" ");
			}
			System.out.println();
		}
	}

}
