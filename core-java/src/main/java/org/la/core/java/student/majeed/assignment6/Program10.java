package org.la.core.java.student.majeed.assignment6;

public class Program10 {

	public static void main(String[] args) {
		/*
		int greatest(int[])
		find greatest element of an array and return that greatest value
		 */
		int[] arr1 = {6,7,8,9,10,1,2,3,4,5}; 
		greatest(arr1);
	}
	
	static void greatest(int[] a) {
		int greatestNum = 0;
		for(int a1:a) {
			if(greatestNum < a1)
				greatestNum=a1;
		}
		System.out.println(greatestNum);
	}	

}