package org.jn.core.java.student.shoaeeb.arrays;

import java.util.Arrays;

public class SumToZero {
	static int []  sumToZero(int n) {
		
		int res[] = new int[n];
		for(int i=1; i<n; i+=2)	
		{
			res[i-1]=i;
			res[i]=-i;
		}
		return res;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res[]=sumToZero(9);
		System.out.println(Arrays.toString(res));
	}

}
