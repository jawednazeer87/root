package org.jn.core.java.student.shoaeeb.arrays;

public class TransposeMatrix {
	static int[][] transpose2(int matrix[][])
	{
		int m=matrix.length;
        int n=matrix[0].length;
        int[][] res = new  int[n][m];
        
        for(int i=m; i>=0; i--)
        {
        	for(int j=0; j<n; j++)
        	{
        		res[i][j]=matrix[i][j];
        	}
        }
        return res;
	}
	static int[][] transposeMatrix(int matrix[][])
	{
		int m=matrix.length;
        int n=matrix[0].length;
        int[][] res = new  int[n][m];
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                res[i][j]=matrix[j][i];
            }
        }
        return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{0,1},{1,0}};
		int newArr[][]  =transpose2(arr);
		int m=newArr.length;
        int n=newArr[0].length;
		for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
            	System.out.print(newArr[i][j]+" ");
            }
            
        }
	}

}
