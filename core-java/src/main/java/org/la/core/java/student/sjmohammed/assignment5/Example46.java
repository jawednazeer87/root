package org.la.core.java.student.sjmohammed.assignment5;
/*
 * 
	46)	wap to add all odd numbers of an array and print the sum
		Suppose given array is [10, 19, 2, 7] -> sum=26 which is sum of 19 and 7, both are odd
 */
public class Example46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,19,2,7};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				sum+=a[i];
			}
		}
		System.out.println("Sum of Odd Number "+sum);	
	}

}
