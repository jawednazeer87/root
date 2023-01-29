package org.jn.core.java.student.shoaeeb.arrays;

import java.util.Arrays;

public class Altitude {

	public static int largestAltitude(int []gain)
	{
		int newArr[] = new int[gain.length+1];
		
		 newArr[0]=0;
		 newArr[1]=gain[0];
		for(int i=2; i<newArr.length; i++)
		{
			newArr[i]=newArr[i-1]+gain[i-1];
		}
		int max=Integer.MIN_VALUE;
		
		for(int i=0; i<newArr.length; i++)
		{
			if(newArr[i]>max)
			{
				max=newArr[i];
			}
		}
		return max;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int gain[] = {-5,1,5,0,-7};
		int max=largestAltitude(gain);
		System.out.println(max);
	}

}
