package org.la.core.java.student.majeed.methods;

//wap to calculate the factorial of each element of an array?

public class Program4 {

	public static void main(String[] args)
    {
	  int[] arr = {1,2,3,4,5,6,7,8,9,10};
	  factorial(arr);
    }

 public static void factorial(int[] arr1) {
		for(int i=0; i<arr1.length;i++) {
			int k = arr1[i];
			int j =1;
			for(;k>=1;k--) {
				j= j*k;
			}
			System.out.println("Factorial of "+arr1[i]+" is: "+j);
		}
	}
	
 }