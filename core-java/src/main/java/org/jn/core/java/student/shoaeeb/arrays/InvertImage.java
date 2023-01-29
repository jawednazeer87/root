package org.jn.core.java.student.shoaeeb.arrays;

public class InvertImage {
	static void flipImage(int[][] image)
	{
		for(int i=0; i<image.length; i++)
		{
			for(int j=0; j<image[i].length/2; j++)
			{
				int temp=image[i][j];
				image[i][j]=image[i][(image[i].length - j-1)];
				image[i][(image[i].length - j-1)]= temp;
		}
		}
		for(int i=0; i<image.length; i++)
		{
			for(int j=0; j<image[i].length; j++)
			{
				if(image[i][j]==1)
				{
					image[i][j]=0;
				}
				else {
					image[i][j]=1;
				}
			}
		}
		
		for(int i=0; i<image.length; i++)
		{
			for(int j=0; j<image[i].length; j++)
			{
				System.out.println(image[i][j]);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
		flipImage(image);

	}

}
