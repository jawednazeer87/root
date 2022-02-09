package org.la.core.java.student.majeed.methods;

//wap to calculate the average value of array elements?

public class Program5 {

	public static void main(String[] args)
    {
	  int[] arr = {1,2,3,4,5,6,7,8,9,10};
	  average(arr);
    }

 public static void average(int[] arr1) {
		int sum = 0;
		for(int i=0; i<arr1.length;i++) {
			sum += arr1[i];
			}
			
			System.out.println(sum/arr1.length);
	}
	
 }